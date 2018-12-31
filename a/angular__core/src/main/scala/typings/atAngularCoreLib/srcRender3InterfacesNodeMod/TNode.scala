package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var attrs: TAttributes | scala.Null
  /**
    * First child of the current node.
    *
    * For component nodes, the child will always be a ContentChild (in same view).
    * For embedded view nodes, the child will be in their child view.
    */
  var child: TNode | scala.Null
  /**
    * If this node is part of an i18n block, it indicates whether this node is part of the DOM.
    * If this node is not part of an i18n block, this field is null.
    */
  var detached: scala.Boolean | scala.Null
  /**
    * This number stores two values using its bits:
    *
    * - the number of directives on that node (first 12 bits)
    * - the starting index of the node's directives in the directives array (last 20 bits).
    *
    * These two values are necessary so DI can effectively search the directives associated
    * with a node without searching the whole directives array.
    */
  var flags: TNodeFlags
  /**
    * Index of the TNode in TView.data and corresponding native element in LViewData.
    *
    * This is necessary to get from any TNode to its corresponding native element when
    * traversing the node tree.
    *
    * If index is -1, this is a dynamically created container node or embedded view node.
    */
  var index: scala.Double
  /** Information about input properties that need to be set once from attribute data. */
  var initialInputs: js.UndefOr[InitialInputData | scala.Null]
  /**
    * The index of the closest injector in this node's LViewData.
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
  var injectorIndex: scala.Double
  /**
    * Input data for all directives on this node.
    *
    * - `undefined` means that the prop has not been initialized yet,
    * - `null` means that the prop has been initialized but no inputs have been found.
    */
  var inputs: js.UndefOr[PropertyAliases | scala.Null]
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
  var localNames: (js.Array[java.lang.String | scala.Double]) | scala.Null
  /**
    * The next sibling node. Necessary so we can propagate through the root nodes of a view
    * to insert them or remove them from the DOM.
    */
  var next: TNode | scala.Null
  /**
    * Output data for all directives on this node.
    *
    * - `undefined` means that the prop has not been initialized yet,
    * - `null` means that the prop has been initialized but no outputs have been found.
    */
  var outputs: js.UndefOr[PropertyAliases | scala.Null]
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
  var parent: TElementNode | TContainerNode | scala.Null
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
    *   the process is recursive in nature (not implementation).
    */
  var projection: (js.Array[TNode | scala.Null]) | scala.Double | scala.Null
  /**
    * This number stores two values using its bits:
    *
    * - the index of the first provider on that node (first 16 bits)
    * - the count of view providers from the component on this node (last 16 bits)
    */
  var providerIndexes: TNodeProviderIndexes
  var stylingTemplate: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext | scala.Null
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
  var tViews: atAngularCoreLib.srcRender3InterfacesViewMod.TView | js.Array[atAngularCoreLib.srcRender3InterfacesViewMod.TView] | scala.Null
  /** The tag name associated with this node. */
  var tagName: java.lang.String | scala.Null
  /** The type of the TNode. See TNodeType. */
  var `type`: TNodeType
}

