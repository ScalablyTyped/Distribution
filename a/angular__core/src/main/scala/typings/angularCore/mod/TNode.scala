package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Binding data (flyweight) for a particular node that is shared between all templates
  * of a specific type.
  *
  * If a property is:
  *    - PropertyAliases: that property's data was generated and this is it
  *    - Null: that property's data was already generated and nothing was found.
  *    - Undefined: that property's data has not yet been generated
  *
  * see: https://en.wikipedia.org/wiki/Flyweight_pattern for more on the Flyweight pattern
  */
trait TNode extends js.Object {
  /**
    * Attributes associated with an element. We need to store attributes to support various use-cases
    * (attribute injection, content projection with selectors, directives matching).
    * Attributes are stored statically because reading them from the DOM would be way too slow for
    * content projection and queries.
    *
    * Since attrs will always be calculated first, they will never need to be marked undefined by
    * other instructions.
    *
    * For regular attributes a name of an attribute and its value alternate in the array.
    * e.g. ['role', 'checkbox']
    * This array can contain flags that will indicate "special attributes" (attributes with
    * namespaces, attributes extracted from bindings and outputs).
    */
  var attrs: TAttributes | Null
  /**
    * First child of the current node.
    *
    * For component nodes, the child will always be a ContentChild (in same view).
    * For embedded view nodes, the child will be in their child view.
    */
  var child: TNode | Null
  /**
    * Stores the head/tail index of the class bindings.
    *
    * - If no bindings, the head and tail will both be 0.
    * - If there are template bindings, stores the head/tail of the class bindings in the template.
    * - If no template bindings but there are host bindings, the head value will point to the last
    *   host binding for "class" (not the head of the linked list), tail will be 0.
    *
    * See: `style_binding_list.ts` for details.
    *
    * This is used by `insertTStylingBinding` to know where the next styling binding should be
    * inserted so that they can be sorted in priority order.
    */
  var classBindings: TStylingRange
  /**
    * A collection of all class static values for an element.
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial classes on an element (e.g. `<div class="one two three">`)
    */
  var classes: String | Null
  /**
    * Stores final exclusive index of the directives.
    */
  var directiveEnd: Double
  /**
    * Stores starting index of the directives.
    */
  var directiveStart: Double
  /**
    * Stores the last directive which had a styling instruction.
    *
    * Initial value of this is `-1` which means that no `hostBindings` styling instruction has
    * executed. As `hostBindings` instructions execute they set the value to the index of the
    * `DirectiveDef` which contained the last `hostBindings` styling instruction.
    *
    * Valid values are:
    * - `-1` No `hostBindings` instruction has executed.
    * - `directiveStart <= directiveStylingLast < directiveEnd`: Points to the `DirectiveDef` of the
    *   last styling instruction which executed in the `hostBindings`.
    *
    * This data is needed so that styling instructions know which static styling data needs to be
    * collected from the `DirectiveDef.hostAttrs`. A styling instruction needs to collect all data
    * since last styling instruction.
    */
  var directiveStylingLast: Double
  /**
    * Stores if Node isComponent, isProjected, hasContentQuery, hasClassInput and hasStyleInput etc.
    */
  var flags: TNodeFlags
  /**
    * Index of the TNode in TView.data and corresponding native element in LView.
    *
    * This is necessary to get from any TNode to its corresponding native element when
    * traversing the node tree.
    *
    * If index is -1, this is a dynamically created container node or embedded view node.
    */
  var index: Double
  /** Information about input properties that need to be set once from attribute data. */
  var initialInputs: js.UndefOr[InitialInputData | Null] = js.undefined
  /**
    * The index of the closest injector in this node's LView.
    *
    * If the index === -1, there is no injector on this node or any ancestor node in this view.
    *
    * If the index !== -1, it is the index of this node's injector OR the index of a parent injector
    * in the same view. We pass the parent injector index down the node tree of a view so it's
    * possible to find the parent injector without walking a potentially deep node tree. Injector
    * indices are not set across view boundaries because there could be multiple component hosts.
    *
    * If tNode.injectorIndex === tNode.parent.injectorIndex, then the index belongs to a parent
    * injector.
    */
  var injectorIndex: Double
  /**
    * Input data for all directives on this node. `null` means that there are no directives with
    * inputs on this node.
    */
  var inputs: PropertyAliases | Null
  /**
    * A set of local names under which a given element is exported in a template and
    * visible to queries. An entry in this array can be created for different reasons:
    * - an element itself is referenced, ex.: `<div #foo>`
    * - a component is referenced, ex.: `<my-cmpt #foo>`
    * - a directive is referenced, ex.: `<my-cmpt #foo="directiveExportAs">`.
    *
    * A given element might have different local names and those names can be associated
    * with a directive. We store local names at even indexes while odd indexes are reserved
    * for directive index in a view (or `-1` if there is no associated directive).
    *
    * Some examples:
    * - `<div #foo>` => `["foo", -1]`
    * - `<my-cmpt #foo>` => `["foo", myCmptIdx]`
    * - `<my-cmpt #foo #bar="directiveExportAs">` => `["foo", myCmptIdx, "bar", directiveIdx]`
    * - `<div #foo #bar="directiveExportAs">` => `["foo", -1, "bar", directiveIdx]`
    */
  var localNames: (js.Array[String | Double]) | Null
  /**
    * Same as `TNode.attrs` but contains merged data across all directive host bindings.
    *
    * We need to keep `attrs` as unmerged so that it can be used for attribute selectors.
    * We merge attrs here so that it can be used in a performant way for initial rendering.
    *
    * The `attrs` are merged in first pass in following order:
    * - Component's `hostAttrs`
    * - Directives' `hostAttrs`
    * - Template `TNode.attrs` associated with the current `TNode`.
    */
  var mergedAttrs: TAttributes | Null
  /**
    * The next sibling node. Necessary so we can propagate through the root nodes of a view
    * to insert them or remove them from the DOM.
    */
  var next: TNode | Null
  /**
    * Output data for all directives on this node. `null` means that there are no directives with
    * outputs on this node.
    */
  var outputs: PropertyAliases | Null
  /**
    * Parent node (in the same view only).
    *
    * We need a reference to a node's parent so we can append the node to its parent's native
    * element at the appropriate time.
    *
    * If the parent would be in a different view (e.g. component host), this property will be null.
    * It's important that we don't try to cross component boundaries when retrieving the parent
    * because the parent will change (e.g. index, attrs) depending on where the component was
    * used (and thus shouldn't be stored on TNode). In these cases, we retrieve the parent through
    * LView.node instead (which will be instance-specific).
    *
    * If this is an inline view node (V), the parent will be its container.
    */
  var parent: ɵangularPackagesCoreCoreBe | TContainerNode | Null
  /**
    * List of projected TNodes for a given component host element OR index into the said nodes.
    *
    * For easier discussion assume this example:
    * `<parent>`'s view definition:
    * ```
    * <child id="c1">content1</child>
    * <child id="c2"><span>content2</span></child>
    * ```
    * `<child>`'s view definition:
    * ```
    * <ng-content id="cont1"></ng-content>
    * ```
    *
    * If `Array.isArray(projection)` then `TNode` is a host element:
    * - `projection` stores the content nodes which are to be projected.
    *    - The nodes represent categories defined by the selector: For example:
    *      `<ng-content/><ng-content select="abc"/>` would represent the heads for `<ng-content/>`
    *      and `<ng-content select="abc"/>` respectively.
    *    - The nodes we store in `projection` are heads only, we used `.next` to get their
    *      siblings.
    *    - The nodes `.next` is sorted/rewritten as part of the projection setup.
    *    - `projection` size is equal to the number of projections `<ng-content>`. The size of
    *      `c1` will be `1` because `<child>` has only one `<ng-content>`.
    * - we store `projection` with the host (`c1`, `c2`) rather than the `<ng-content>` (`cont1`)
    *   because the same component (`<child>`) can be used in multiple locations (`c1`, `c2`) and as
    *   a result have different set of nodes to project.
    * - without `projection` it would be difficult to efficiently traverse nodes to be projected.
    *
    * If `typeof projection == 'number'` then `TNode` is a `<ng-content>` element:
    * - `projection` is an index of the host's `projection`Nodes.
    *   - This would return the first head node to project:
    *     `getHost(currentTNode).projection[currentTNode.projection]`.
    * - When projecting nodes the parent node retrieved may be a `<ng-content>` node, in which case
    *   the process is recursive in nature.
    *
    * If `projection` is of type `RNode[][]` than we have a collection of native nodes passed as
    * projectable nodes during dynamic component creation.
    */
  var projection: (js.Array[TNode | js.Array[RNode]]) | Double | Null
  /**
    * The next projected sibling. Since in Angular content projection works on the node-by-node basis
    * the act of projecting nodes might change nodes relationship at the insertion point (target
    * view). At the same time we need to keep initial relationship between nodes as expressed in
    * content view.
    */
  var projectionNext: TNode | Null
  /**
    * Stores indexes of property bindings. This field is only set in the ngDevMode and holds indexes
    * of property bindings so TestBed can get bound property metadata for a given node.
    */
  var propertyBindings: js.Array[Double] | Null
  /**
    * This number stores two values using its bits:
    *
    * - the index of the first provider on that node (first 16 bits)
    * - the count of view providers from the component on this node (last 16 bits)
    */
  var providerIndexes: TNodeProviderIndexes
  /**
    * A `KeyValueArray` version of residual `classes`.
    *
    * Same as `TNode.residualStyles` but for classes.
    *
    * - `undefined': not initialized.
    * - `null`: initialized but `classes` is `null`
    * - `KeyValueArray`: parsed version of `classes`.
    */
  var residualClasses: js.UndefOr[KeyValueArray[_] | Null] = js.undefined
  /**
    * A `KeyValueArray` version of residual `styles`.
    *
    * When there are styling instructions than each instruction stores the static styling
    * which is of lower priority than itself. This means that there may be a higher priority styling
    * than the instruction.
    *
    * Imagine:
    * ```
    * <div style="color: highest;" my-dir>
    *
    * @Directive({
    *   host: {
    *     style: 'color: lowest; ',
    *     '[styles.color]': 'exp' // ɵɵstyleProp('color', ctx.exp);
    *   }
    * })
    * ```
    *
    * In the above case:
    * - `color: lowest` is stored with `ɵɵstyleProp('color', ctx.exp);` instruction
    * -  `color: highest` is the residual and is stored here.
    *
    * - `undefined': not initialized.
    * - `null`: initialized but `styles` is `null`
    * - `KeyValueArray`: parsed version of `styles`.
    */
  var residualStyles: js.UndefOr[KeyValueArray[_] | Null] = js.undefined
  /**
    * Stores the head/tail index of the class bindings.
    *
    * - If no bindings, the head and tail will both be 0.
    * - If there are template bindings, stores the head/tail of the style bindings in the template.
    * - If no template bindings but there are host bindings, the head value will point to the last
    *   host binding for "style" (not the head of the linked list), tail will be 0.
    *
    * See: `style_binding_list.ts` for details.
    *
    * This is used by `insertTStylingBinding` to know where the next styling binding should be
    * inserted so that they can be sorted in priority order.
    */
  var styleBindings: TStylingRange
  /**
    * A collection of all style static values for an element.
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial styles on an element (e.g. `<div style="width:200px">`)
    */
  var styles: String | Null
  /**
    * The TView or TViews attached to this node.
    *
    * If this TNode corresponds to an LContainer with inline views, the container will
    * need to store separate static data for each of its view blocks (TView[]). Otherwise,
    * nodes in inline views with the same index as nodes in their parent views will overwrite
    * each other, as they are in the same template.
    *
    * Each index in this array corresponds to the static data for a certain
    * view. So if you had V(0) and V(1) in a container, you might have:
    *
    * [
    *   [{tagName: 'div', attrs: ...}, null],     // V(0) TView
    *   [{tagName: 'button', attrs ...}, null]    // V(1) TView
    *
    * If this TNode corresponds to an LContainer with a template (e.g. structural
    * directive), the template's TView will be stored here.
    *
    * If this TNode corresponds to an element, tViews will be null .
    */
  var tViews: TView | js.Array[TView] | Null
  /** The tag name associated with this node. */
  var tagName: String | Null
  /** The type of the TNode. See TNodeType. */
  var `type`: TNodeType
}

object TNode {
  @scala.inline
  def apply(
    classBindings: TStylingRange,
    directiveEnd: Double,
    directiveStart: Double,
    directiveStylingLast: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: TNode = null,
    classes: String = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangularPackagesCoreCoreBe | TContainerNode = null,
    projection: (js.Array[TNode | js.Array[RNode]]) | Double = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: KeyValueArray[_] = null,
    residualStyles: KeyValueArray[_] = null,
    styles: String = null,
    tViews: TView | js.Array[TView] = null,
    tagName: String = null
  ): TNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (localNames != null) __obj.updateDynamic("localNames")(localNames.asInstanceOf[js.Any])
    if (mergedAttrs != null) __obj.updateDynamic("mergedAttrs")(mergedAttrs.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext.asInstanceOf[js.Any])
    if (propertyBindings != null) __obj.updateDynamic("propertyBindings")(propertyBindings.asInstanceOf[js.Any])
    if (residualClasses != null) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (residualStyles != null) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tViews != null) __obj.updateDynamic("tViews")(tViews.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNode]
  }
}

