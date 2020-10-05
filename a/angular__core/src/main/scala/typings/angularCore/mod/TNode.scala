package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
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
  var attrs: TAttributes | Null = js.native
  /**
    * First child of the current node.
    *
    * For component nodes, the child will always be a ContentChild (in same view).
    * For embedded view nodes, the child will be in their child view.
    */
  var child: TNode | Null = js.native
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
  var classBindings: TStylingRange = js.native
  /**
    * A collection of all class static values for an element (including from host).
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial classes on an element (e.g. `<div class="one two three">`)
    * - There are one or more initial classes on an directive/component host
    *   (e.g. `@Directive({host: {class: "SOME_CLASS" } }`)
    */
  var classes: String | Null = js.native
  /**
    * A collection of all class static values for an element excluding host sources.
    *
    * Populated when there are one or more initial classes on an element
    * (e.g. `<div class="SOME_CLASS">`)
    * Must be stored separately from `tNode.classes` to facilitate setting directive
    * inputs that shadow the `class` property. If we used `tNode.classes` as is for shadowed inputs,
    * we would feed host classes back into directives as "inputs". If we used `tNode.attrs`, we would
    * have to concatenate the attributes on every template pass. Instead, we process once on first
    * create pass and store here.
    */
  var classesWithoutHost: String | Null = js.native
  /**
    * Stores final exclusive index of the directives.
    */
  var directiveEnd: Double = js.native
  /**
    * Stores starting index of the directives.
    */
  var directiveStart: Double = js.native
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
  var directiveStylingLast: Double = js.native
  /**
    * Stores if Node isComponent, isProjected, hasContentQuery, hasClassInput and hasStyleInput etc.
    */
  var flags: TNodeFlags = js.native
  /**
    * Index of the TNode in TView.data and corresponding native element in LView.
    *
    * This is necessary to get from any TNode to its corresponding native element when
    * traversing the node tree.
    *
    * If index is -1, this is a dynamically created container node or embedded view node.
    */
  var index: Double = js.native
  /** Information about input properties that need to be set once from attribute data. */
  var initialInputs: js.UndefOr[InitialInputData | Null] = js.native
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
  var injectorIndex: Double = js.native
  /**
    * Input data for all directives on this node. `null` means that there are no directives with
    * inputs on this node.
    */
  var inputs: PropertyAliases | Null = js.native
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
  var localNames: (js.Array[String | Double]) | Null = js.native
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
  var mergedAttrs: TAttributes | Null = js.native
  /**
    * The next sibling node. Necessary so we can propagate through the root nodes of a view
    * to insert them or remove them from the DOM.
    */
  var next: TNode | Null = js.native
  /**
    * Output data for all directives on this node. `null` means that there are no directives with
    * outputs on this node.
    */
  var outputs: PropertyAliases | Null = js.native
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
  var parent: ɵangularPackagesCoreCoreBf | TContainerNode | Null = js.native
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
  var projection: (js.Array[TNode | js.Array[RNode]]) | Double | Null = js.native
  /**
    * The next projected sibling. Since in Angular content projection works on the node-by-node basis
    * the act of projecting nodes might change nodes relationship at the insertion point (target
    * view). At the same time we need to keep initial relationship between nodes as expressed in
    * content view.
    */
  var projectionNext: TNode | Null = js.native
  /**
    * Stores indexes of property bindings. This field is only set in the ngDevMode and holds indexes
    * of property bindings so TestBed can get bound property metadata for a given node.
    */
  var propertyBindings: js.Array[Double] | Null = js.native
  /**
    * This number stores two values using its bits:
    *
    * - the index of the first provider on that node (first 16 bits)
    * - the count of view providers from the component on this node (last 16 bits)
    */
  var providerIndexes: TNodeProviderIndexes = js.native
  /**
    * A `KeyValueArray` version of residual `classes`.
    *
    * Same as `TNode.residualStyles` but for classes.
    *
    * - `undefined': not initialized.
    * - `null`: initialized but `classes` is `null`
    * - `KeyValueArray`: parsed version of `classes`.
    */
  var residualClasses: js.UndefOr[KeyValueArray[_] | Null] = js.native
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
  var residualStyles: js.UndefOr[KeyValueArray[_] | Null] = js.native
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
  var styleBindings: TStylingRange = js.native
  /**
    * A collection of all `style` static values for an element (including from host).
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial `style`s on an element (e.g. `<div style="width:200px;">`)
    * - There are one or more initial `style`s on a directive/component host
    *   (e.g. `@Directive({host: {style: "width:200px;" } }`)
    */
  var styles: String | Null = js.native
  /**
    * A collection of all `style` static values for an element excluding host sources.
    *
    * Populated when there are one or more initial `style`s on an element
    * (e.g. `<div style="width:200px;">`)
    * Must be stored separately from `tNode.styles` to facilitate setting directive
    * inputs that shadow the `style` property. If we used `tNode.styles` as is for shadowed inputs,
    * we would feed host styles back into directives as "inputs". If we used `tNode.attrs`, we would
    * have to concatenate the attributes on every template pass. Instead, we process once on first
    * create pass and store here.
    */
  var stylesWithoutHost: String | Null = js.native
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
  var tViews: TView | js.Array[TView] | Null = js.native
  /** The tag name associated with this node. */
  var tagName: String | Null = js.native
  /** The type of the TNode. See TNodeType. */
  var `type`: TNodeType = js.native
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
    `type`: TNodeType
  ): TNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNode]
  }
  @scala.inline
  implicit class TNodeOps[Self <: TNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassBindings(value: TStylingRange): Self = this.set("classBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectiveEnd(value: Double): Self = this.set("directiveEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectiveStart(value: Double): Self = this.set("directiveStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectiveStylingLast(value: Double): Self = this.set("directiveStylingLast", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: TNodeFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInjectorIndex(value: Double): Self = this.set("injectorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderIndexes(value: TNodeProviderIndexes): Self = this.set("providerIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleBindings(value: TStylingRange): Self = this.set("styleBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TNodeType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = this.set("attrs", js.Array(value :_*))
    @scala.inline
    def setAttrs(value: TAttributes): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrsNull: Self = this.set("attrs", null)
    @scala.inline
    def setChild(value: TNode): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNull: Self = this.set("child", null)
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassesNull: Self = this.set("classes", null)
    @scala.inline
    def setClassesWithoutHost(value: String): Self = this.set("classesWithoutHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassesWithoutHostNull: Self = this.set("classesWithoutHost", null)
    @scala.inline
    def setInitialInputsVarargs(value: (InitialInputs | Null)*): Self = this.set("initialInputs", js.Array(value :_*))
    @scala.inline
    def setInitialInputs(value: InitialInputData): Self = this.set("initialInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialInputs: Self = this.set("initialInputs", js.undefined)
    @scala.inline
    def setInitialInputsNull: Self = this.set("initialInputs", null)
    @scala.inline
    def setInputs(value: PropertyAliases): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsNull: Self = this.set("inputs", null)
    @scala.inline
    def setLocalNamesVarargs(value: (String | Double)*): Self = this.set("localNames", js.Array(value :_*))
    @scala.inline
    def setLocalNames(value: js.Array[String | Double]): Self = this.set("localNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalNamesNull: Self = this.set("localNames", null)
    @scala.inline
    def setMergedAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = this.set("mergedAttrs", js.Array(value :_*))
    @scala.inline
    def setMergedAttrs(value: TAttributes): Self = this.set("mergedAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergedAttrsNull: Self = this.set("mergedAttrs", null)
    @scala.inline
    def setNext(value: TNode): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setOutputs(value: PropertyAliases): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsNull: Self = this.set("outputs", null)
    @scala.inline
    def setParent(value: ɵangularPackagesCoreCoreBf | TContainerNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    @scala.inline
    def setProjectionVarargs(value: (TNode | js.Array[RNode])*): Self = this.set("projection", js.Array(value :_*))
    @scala.inline
    def setProjection(value: (js.Array[TNode | js.Array[RNode]]) | Double): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectionNull: Self = this.set("projection", null)
    @scala.inline
    def setProjectionNext(value: TNode): Self = this.set("projectionNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectionNextNull: Self = this.set("projectionNext", null)
    @scala.inline
    def setPropertyBindingsVarargs(value: Double*): Self = this.set("propertyBindings", js.Array(value :_*))
    @scala.inline
    def setPropertyBindings(value: js.Array[Double]): Self = this.set("propertyBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyBindingsNull: Self = this.set("propertyBindings", null)
    @scala.inline
    def setResidualClasses(value: KeyValueArray[_]): Self = this.set("residualClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidualClasses: Self = this.set("residualClasses", js.undefined)
    @scala.inline
    def setResidualClassesNull: Self = this.set("residualClasses", null)
    @scala.inline
    def setResidualStyles(value: KeyValueArray[_]): Self = this.set("residualStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidualStyles: Self = this.set("residualStyles", js.undefined)
    @scala.inline
    def setResidualStylesNull: Self = this.set("residualStyles", null)
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesNull: Self = this.set("styles", null)
    @scala.inline
    def setStylesWithoutHost(value: String): Self = this.set("stylesWithoutHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesWithoutHostNull: Self = this.set("stylesWithoutHost", null)
    @scala.inline
    def setTViewsVarargs(value: TView*): Self = this.set("tViews", js.Array(value :_*))
    @scala.inline
    def setTViews(value: TView | js.Array[TView]): Self = this.set("tViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setTViewsNull: Self = this.set("tViews", null)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagNameNull: Self = this.set("tagName", null)
  }
  
}

