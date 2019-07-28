package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.InitialInputData
import typings.atAngularCore.TAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for an LContainer */
trait TContainerNode
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_TContainerNode: Null
  /**
    * Container nodes will have parents unless:
    *
    * - They are the first node of a component or embedded view
    * - They are dynamically created
    */
  @JSName("parent")
  var parent_TContainerNode: ɵangular_packages_core_core_bg | TElementContainerNode | Null
  @JSName("projection")
  var projection_TContainerNode: Null
}

object TContainerNode {
  @scala.inline
  def apply(
    child: Null,
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    `type`: TNodeType,
    attrs: TAttributes = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    newClasses: TStylingContext = null,
    newStyles: TStylingContext = null,
    next: TNode = null,
    onElementCreationFns: js.Array[js.Function] = null,
    outputs: PropertyAliases = null,
    parent: ɵangular_packages_core_core_bg | TElementContainerNode = null,
    projectionNext: TNode = null,
    stylingTemplate: StylingContext = null,
    tViews: TView | js.Array[TView] = null,
    tagName: String = null
  ): TContainerNode = {
    val __obj = js.Dynamic.literal(child = child, directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, projection = projection, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes)
    __obj.updateDynamic("type")(`type`)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (newClasses != null) __obj.updateDynamic("newClasses")(newClasses)
    if (newStyles != null) __obj.updateDynamic("newStyles")(newStyles)
    if (next != null) __obj.updateDynamic("next")(next)
    if (onElementCreationFns != null) __obj.updateDynamic("onElementCreationFns")(onElementCreationFns)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext)
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tViews != null) __obj.updateDynamic("tViews")(tViews.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TContainerNode]
  }
}

