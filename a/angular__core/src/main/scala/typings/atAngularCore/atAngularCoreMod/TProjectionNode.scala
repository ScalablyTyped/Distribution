package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.InitialInputData
import typings.atAngularCore.TAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for an LProjectionNode  */
trait TProjectionNode extends TNode {
  /** Index in the data[] array */
  @JSName("child")
  var child_TProjectionNode: Null
  /**
    * Projection nodes will have parents unless they are the first node of a component
    * or embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TProjectionNode: ɵangular_packages_core_core_bf | TElementContainerNode | Null
  /** Index of the projection node. (See TNode.projection for more info.) */
  @JSName("projection")
  var projection_TProjectionNode: Double
  @JSName("tViews")
  var tViews_TProjectionNode: Null
}

object TProjectionNode {
  @scala.inline
  def apply(
    child: Null,
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Double,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    classes: StylingMapArray | TStylingContext = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangular_packages_core_core_bf | TElementContainerNode = null,
    projectionNext: TNode = null,
    styles: StylingMapArray | TStylingContext = null,
    tagName: String = null
  ): TProjectionNode = {
    val __obj = js.Dynamic.literal(child = child, directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, projection = projection, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes, tViews = tViews)
    __obj.updateDynamic("type")(`type`)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (next != null) __obj.updateDynamic("next")(next)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TProjectionNode]
  }
}

