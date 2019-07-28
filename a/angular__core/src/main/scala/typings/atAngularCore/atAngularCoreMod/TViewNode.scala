package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.InitialInputData
import typings.atAngularCore.TAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a view  */
trait TViewNode extends TNode {
  @JSName("child")
  var child_TViewNode: ɵangular_packages_core_core_bg | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null
  @JSName("parent")
  var parent_TViewNode: TContainerNode | Null
  @JSName("projection")
  var projection_TViewNode: Null
  @JSName("tViews")
  var tViews_TViewNode: Null
}

object TViewNode {
  @scala.inline
  def apply(
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: ɵangular_packages_core_core_bg | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    newClasses: TStylingContext = null,
    newStyles: TStylingContext = null,
    next: TNode = null,
    onElementCreationFns: js.Array[js.Function] = null,
    outputs: PropertyAliases = null,
    parent: TContainerNode = null,
    projectionNext: TNode = null,
    stylingTemplate: StylingContext = null,
    tagName: String = null
  ): TViewNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, projection = projection, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes, tViews = tViews)
    __obj.updateDynamic("type")(`type`)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (newClasses != null) __obj.updateDynamic("newClasses")(newClasses)
    if (newStyles != null) __obj.updateDynamic("newStyles")(newStyles)
    if (next != null) __obj.updateDynamic("next")(next)
    if (onElementCreationFns != null) __obj.updateDynamic("onElementCreationFns")(onElementCreationFns)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext)
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TViewNode]
  }
}

