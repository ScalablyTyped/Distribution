package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.InitialInputData
import typings.atAngularCore.TAttributes
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
    * A collection of all class bindings and/or static class values for an element.
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial classes on an element (e.g. `<div class="one two three">`)
    * - There are one or more class bindings on an element (e.g. `<div [class.foo]="f">`)
    *
    * If and when there are only initial classes (no bindings) then an instance of `StylingMapArray`
    * will be used here. Otherwise an instance of `TStylingContext` will be created when there
    * are one or more class bindings on an element.
    *
    * During element creation this value is likely to be populated with an instance of
    * `StylingMapArray` and only when the bindings are evaluated (which happens during
    * update mode) then it will be converted to a `TStylingContext` if any class bindings
    * are encountered. If and when this happens then the existing `StylingMapArray` value
    * will be placed into the initial styling slot in the newly created `TStylingContext`.
    */
  var classes: StylingMapArray | TStylingContext | Null
  /**
    * Stores final exclusive index of the directives.
    */
  var directiveEnd: Double
  /**
    * Stores starting index of the directives.
    */
  var directiveStart: Double
  /**
    * Stores if Node isComponent, isProjected, hasContentQuery, hasClassInput and hasStyleInput
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
    * Input data for all directives on this node.
    *
    * - `undefined` means that the prop has not been initialized yet,
    * - `null` means that the prop has been initialized but no inputs have been found.
    */
  var inputs: js.UndefOr[PropertyAliases | Null] = js.undefined
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
    * The next sibling node. Necessary so we can propagate through the root nodes of a view
    * to insert them or remove them from the DOM.
    */
  var next: TNode | Null
  /**
    * Output data for all directives on this node.
    *
    * - `undefined` means that the prop has not been initialized yet,
    * - `null` means that the prop has been initialized but no outputs have been found.
    */
  var outputs: js.UndefOr[PropertyAliases | Null] = js.undefined
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
  var parent: ɵangular_packages_core_core_bf | TContainerNode | Null
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
    * Stores the exclusive final index where property binding metadata is
    * stored for this node.
    */
  var propertyMetadataEndIndex: Double
  /**
    * Stores the first index where property binding metadata is stored for
    * this node.
    */
  var propertyMetadataStartIndex: Double
  /**
    * This number stores two values using its bits:
    *
    * - the index of the first provider on that node (first 16 bits)
    * - the count of view providers from the component on this node (last 16 bits)
    */
  var providerIndexes: TNodeProviderIndexes
  /**
    * A collection of all style bindings and/or static style values for an element.
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial styles on an element (e.g. `<div style="width:200px">`)
    * - There are one or more style bindings on an element (e.g. `<div [style.width]="w">`)
    *
    * If and when there are only initial styles (no bindings) then an instance of `StylingMapArray`
    * will be used here. Otherwise an instance of `TStylingContext` will be created when there
    * are one or more style bindings on an element.
    *
    * During element creation this value is likely to be populated with an instance of
    * `StylingMapArray` and only when the bindings are evaluated (which happens during
    * update mode) then it will be converted to a `TStylingContext` if any style bindings
    * are encountered. If and when this happens then the existing `StylingMapArray` value
    * will be placed into the initial styling slot in the newly created `TStylingContext`.
    */
  var styles: StylingMapArray | TStylingContext | Null
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
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: TNode = null,
    classes: StylingMapArray | TStylingContext = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangular_packages_core_core_bf | TContainerNode = null,
    projection: (js.Array[TNode | js.Array[RNode]]) | Double = null,
    projectionNext: TNode = null,
    styles: StylingMapArray | TStylingContext = null,
    tViews: TView | js.Array[TView] = null,
    tagName: String = null
  ): TNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes)
    __obj.updateDynamic("type")(`type`)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (child != null) __obj.updateDynamic("child")(child)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (next != null) __obj.updateDynamic("next")(next)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tViews != null) __obj.updateDynamic("tViews")(tViews.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TNode]
  }
}

