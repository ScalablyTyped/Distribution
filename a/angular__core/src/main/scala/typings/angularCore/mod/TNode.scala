package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait TNode extends StObject {
  
  /**
    * Attributes associated with an element. We need to store attributes to support various
    * use-cases (attribute injection, content projection with selectors, directives matching).
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
    * A collection of all class static values for an element (including from host).
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial classes on an element (e.g. `<div class="one two three">`)
    * - There are one or more initial classes on an directive/component host
    *   (e.g. `@Directive({host: {class: "SOME_CLASS" } }`)
    */
  var classes: String | Null
  
  /**
    * A collection of all class static values for an element excluding host sources.
    *
    * Populated when there are one or more initial classes on an element
    * (e.g. `<div class="SOME_CLASS">`)
    * Must be stored separately from `tNode.classes` to facilitate setting directive
    * inputs that shadow the `class` property. If we used `tNode.classes` as is for shadowed
    * inputs, we would feed host classes back into directives as "inputs". If we used
    * `tNode.attrs`, we would have to concatenate the attributes on every template pass. Instead,
    * we process once on first create pass and store here.
    */
  var classesWithoutHost: String | Null
  
  /**
    * Stores final exclusive index of the directives.
    *
    * The area right behind the `directiveStart-directiveEnd` range is used to allocate the
    * `HostBindingFunction` `vars` (or null if no bindings.) Therefore `directiveEnd` is used to set
    * `LFrame.bindingRootIndex` before `HostBindingFunction` is executed.
    */
  var directiveEnd: Double
  
  /**
    * Stores starting index of the directives.
    *
    * NOTE: The first directive is always component (if present).
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
    * - `directiveStart <= directiveStylingLast < directiveEnd`: Points to the `DirectiveDef` of
    * the last styling instruction which executed in the `hostBindings`.
    *
    * This data is needed so that styling instructions know which static styling data needs to be
    * collected from the `DirectiveDef.hostAttrs`. A styling instruction needs to collect all data
    * since last styling instruction.
    */
  var directiveStylingLast: Double
  
  /**
    * Stores if Node isComponent, isProjected, hasContentQuery, hasClassInput and hasStyleInput
    * etc.
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
    * If the index !== -1, it is the index of this node's injector OR the index of a parent
    * injector in the same view. We pass the parent injector index down the node tree of a view so
    * it's possible to find the parent injector without walking a potentially deep node tree.
    * Injector indices are not set across view boundaries because there could be multiple component
    * hosts.
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
    * Insert before existing DOM node index.
    *
    * When DOM nodes are being inserted, normally they are being appended as they are created.
    * Under i18n case, the translated text nodes are created ahead of time as part of the
    * `ɵɵi18nStart` instruction which means that this `TNode` can't just be appended and instead
    * needs to be inserted using `insertBeforeIndex` semantics.
    *
    * Additionally sometimes it is necessary to insert new text nodes as a child of this `TNode`. In
    * such a case the value stores an array of text nodes to insert.
    *
    * Example:
    * ```
    * <div i18n>
    *   Hello <span>World</span>!
    * </div>
    * ```
    * In the above example the `ɵɵi18nStart` instruction can create `Hello `, `World` and `!` text
    * nodes. It can also insert `Hello ` and `!` text node as a child of `<div>`, but it can't
    * insert `World` because the `<span>` node has not yet been created. In such a case the
    * `<span>` `TNode` will have an array which will direct the `<span>` to not only insert
    * itself in front of `!` but also to insert the `World` (created by `ɵɵi18nStart`) into
    * `<span>` itself.
    *
    * Pseudo code:
    * ```
    *   if (insertBeforeIndex === null) {
    *     // append as normal
    *   } else if (Array.isArray(insertBeforeIndex)) {
    *     // First insert current `TNode` at correct location
    *     const currentNode = lView[this.index];
    *     parentNode.insertBefore(currentNode, lView[this.insertBeforeIndex[0]]);
    *     // Now append all of the children
    *     for(let i=1; i<this.insertBeforeIndex; i++) {
    *       currentNode.appendChild(lView[this.insertBeforeIndex[i]]);
    *     }
    *   } else {
    *     parentNode.insertBefore(lView[this.index], lView[this.insertBeforeIndex])
    *   }
    * ```
    * - null: Append as normal using `parentNode.appendChild`
    * - `number`: Append using
    *      `parentNode.insertBefore(lView[this.index], lView[this.insertBeforeIndex])`
    *
    * *Initialization*
    *
    * Because `ɵɵi18nStart` executes before nodes are created, on `TView.firstCreatePass` it is not
    * possible for `ɵɵi18nStart` to set the `insertBeforeIndex` value as the corresponding `TNode`
    * has not yet been created. For this reason the `ɵɵi18nStart` creates a `TNodeType.Placeholder`
    * `TNode` at that location. See `TNodeType.Placeholder` for more information.
    */
  var insertBeforeIndex: InsertBeforeIndex
  
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
  var parent: TElementNode | TContainerNode | Null
  
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
    *   because the same component (`<child>`) can be used in multiple locations (`c1`, `c2`) and
    * as a result have different set of nodes to project.
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
    * The next projected sibling. Since in Angular content projection works on the node-by-node
    * basis the act of projecting nodes might change nodes relationship at the insertion point
    * (target view). At the same time we need to keep initial relationship between nodes as
    * expressed in content view.
    */
  var projectionNext: TNode | Null
  
  /**
    * Stores indexes of property bindings. This field is only set in the ngDevMode and holds
    * indexes of property bindings so TestBed can get bound property metadata for a given node.
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
  var residualClasses: js.UndefOr[KeyValueArray[Any] | Null] = js.undefined
  
  /**
    * A `KeyValueArray` version of residual `styles`.
    *
    * When there are styling instructions than each instruction stores the static styling
    * which is of lower priority than itself. This means that there may be a higher priority
    * styling than the instruction.
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
  var residualStyles: js.UndefOr[KeyValueArray[Any] | Null] = js.undefined
  
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
    * A collection of all `style` static values for an element (including from host).
    *
    * This field will be populated if and when:
    *
    * - There are one or more initial `style`s on an element (e.g. `<div style="width:200px;">`)
    * - There are one or more initial `style`s on a directive/component host
    *   (e.g. `@Directive({host: {style: "width:200px;" } }`)
    */
  var styles: String | Null
  
  /**
    * A collection of all `style` static values for an element excluding host sources.
    *
    * Populated when there are one or more initial `style`s on an element
    * (e.g. `<div style="width:200px;">`)
    * Must be stored separately from `tNode.styles` to facilitate setting directive
    * inputs that shadow the `style` property. If we used `tNode.styles` as is for shadowed inputs,
    * we would feed host styles back into directives as "inputs". If we used `tNode.attrs`, we
    * would have to concatenate the attributes on every template pass. Instead, we process once on
    * first create pass and store here.
    */
  var stylesWithoutHost: String | Null
  
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
  
  /** The type of the TNode. See TNodeType. */
  var `type`: TNodeType
  
  /**
    * The value name associated with this node.
    * if type:
    *   `TNodeType.Text`: text value
    *   `TNodeType.Element`: tag name
    *   `TNodeType.ICUContainer`: `TIcu`
    */
  var value: Any
}
object TNode {
  
  inline def apply(
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
    value: Any
  ): TNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, child = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, projection = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null, tViews = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNode]
  }
  
  extension [Self <: TNode](x: Self) {
    
    inline def setAttrs(value: TAttributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
    
    inline def setAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setChild(value: TNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildNull: Self = StObject.set(x, "child", null)
    
    inline def setClassBindings(value: TStylingRange): Self = StObject.set(x, "classBindings", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesNull: Self = StObject.set(x, "classes", null)
    
    inline def setClassesWithoutHost(value: String): Self = StObject.set(x, "classesWithoutHost", value.asInstanceOf[js.Any])
    
    inline def setClassesWithoutHostNull: Self = StObject.set(x, "classesWithoutHost", null)
    
    inline def setDirectiveEnd(value: Double): Self = StObject.set(x, "directiveEnd", value.asInstanceOf[js.Any])
    
    inline def setDirectiveStart(value: Double): Self = StObject.set(x, "directiveStart", value.asInstanceOf[js.Any])
    
    inline def setDirectiveStylingLast(value: Double): Self = StObject.set(x, "directiveStylingLast", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: TNodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInitialInputs(value: InitialInputData): Self = StObject.set(x, "initialInputs", value.asInstanceOf[js.Any])
    
    inline def setInitialInputsNull: Self = StObject.set(x, "initialInputs", null)
    
    inline def setInitialInputsUndefined: Self = StObject.set(x, "initialInputs", js.undefined)
    
    inline def setInitialInputsVarargs(value: (InitialInputs | Null)*): Self = StObject.set(x, "initialInputs", js.Array(value*))
    
    inline def setInjectorIndex(value: Double): Self = StObject.set(x, "injectorIndex", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PropertyAliases): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    inline def setInsertBeforeIndex(value: InsertBeforeIndex): Self = StObject.set(x, "insertBeforeIndex", value.asInstanceOf[js.Any])
    
    inline def setInsertBeforeIndexNull: Self = StObject.set(x, "insertBeforeIndex", null)
    
    inline def setInsertBeforeIndexVarargs(value: Double*): Self = StObject.set(x, "insertBeforeIndex", js.Array(value*))
    
    inline def setLocalNames(value: js.Array[String | Double]): Self = StObject.set(x, "localNames", value.asInstanceOf[js.Any])
    
    inline def setLocalNamesNull: Self = StObject.set(x, "localNames", null)
    
    inline def setLocalNamesVarargs(value: (String | Double)*): Self = StObject.set(x, "localNames", js.Array(value*))
    
    inline def setMergedAttrs(value: TAttributes): Self = StObject.set(x, "mergedAttrs", value.asInstanceOf[js.Any])
    
    inline def setMergedAttrsNull: Self = StObject.set(x, "mergedAttrs", null)
    
    inline def setMergedAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = StObject.set(x, "mergedAttrs", js.Array(value*))
    
    inline def setNext(value: TNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setOutputs(value: PropertyAliases): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsNull: Self = StObject.set(x, "outputs", null)
    
    inline def setParent(value: TElementNode | TContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProjection(value: (js.Array[TNode | js.Array[RNode]]) | Double): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionNext(value: TNode): Self = StObject.set(x, "projectionNext", value.asInstanceOf[js.Any])
    
    inline def setProjectionNextNull: Self = StObject.set(x, "projectionNext", null)
    
    inline def setProjectionNull: Self = StObject.set(x, "projection", null)
    
    inline def setProjectionVarargs(value: (TNode | js.Array[RNode])*): Self = StObject.set(x, "projection", js.Array(value*))
    
    inline def setPropertyBindings(value: js.Array[Double]): Self = StObject.set(x, "propertyBindings", value.asInstanceOf[js.Any])
    
    inline def setPropertyBindingsNull: Self = StObject.set(x, "propertyBindings", null)
    
    inline def setPropertyBindingsVarargs(value: Double*): Self = StObject.set(x, "propertyBindings", js.Array(value*))
    
    inline def setProviderIndexes(value: TNodeProviderIndexes): Self = StObject.set(x, "providerIndexes", value.asInstanceOf[js.Any])
    
    inline def setResidualClasses(value: KeyValueArray[Any]): Self = StObject.set(x, "residualClasses", value.asInstanceOf[js.Any])
    
    inline def setResidualClassesNull: Self = StObject.set(x, "residualClasses", null)
    
    inline def setResidualClassesUndefined: Self = StObject.set(x, "residualClasses", js.undefined)
    
    inline def setResidualStyles(value: KeyValueArray[Any]): Self = StObject.set(x, "residualStyles", value.asInstanceOf[js.Any])
    
    inline def setResidualStylesNull: Self = StObject.set(x, "residualStyles", null)
    
    inline def setResidualStylesUndefined: Self = StObject.set(x, "residualStyles", js.undefined)
    
    inline def setStyleBindings(value: TStylingRange): Self = StObject.set(x, "styleBindings", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesWithoutHost(value: String): Self = StObject.set(x, "stylesWithoutHost", value.asInstanceOf[js.Any])
    
    inline def setStylesWithoutHostNull: Self = StObject.set(x, "stylesWithoutHost", null)
    
    inline def setTViews(value: TView | js.Array[TView]): Self = StObject.set(x, "tViews", value.asInstanceOf[js.Any])
    
    inline def setTViewsNull: Self = StObject.set(x, "tViews", null)
    
    inline def setTViewsVarargs(value: TView*): Self = StObject.set(x, "tViews", js.Array(value*))
    
    inline def setType(value: TNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
