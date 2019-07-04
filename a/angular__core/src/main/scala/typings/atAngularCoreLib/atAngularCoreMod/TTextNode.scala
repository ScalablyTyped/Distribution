package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a text node */
trait TTextNode extends TNode {
  @JSName("child")
  var child_TTextNode: scala.Null
  /**
    * Text nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TTextNode: ɵangular_packages_core_core_bg | TElementContainerNode | scala.Null
  @JSName("projection")
  var projection_TTextNode: scala.Null
  @JSName("tViews")
  var tViews_TTextNode: scala.Null
}

object TTextNode {
  @scala.inline
  def apply(
    child: scala.Null,
    directiveEnd: scala.Double,
    directiveStart: scala.Double,
    flags: TNodeFlags,
    index: scala.Double,
    injectorIndex: scala.Double,
    projection: scala.Null,
    propertyMetadataEndIndex: scala.Double,
    propertyMetadataStartIndex: scala.Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: scala.Null,
    `type`: TNodeType,
    attrs: atAngularCoreLib.TAttributes = null,
    initialInputs: atAngularCoreLib.InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[java.lang.String | scala.Double] = null,
    newClasses: TStylingContext = null,
    newStyles: TStylingContext = null,
    next: TNode = null,
    onElementCreationFns: js.Array[js.Function] = null,
    outputs: PropertyAliases = null,
    parent: ɵangular_packages_core_core_bg | TElementContainerNode = null,
    projectionNext: TNode = null,
    stylingTemplate: StylingContext = null,
    tagName: java.lang.String = null
  ): TTextNode = {
    val __obj = js.Dynamic.literal(child = child, directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, projection = projection, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes, tViews = tViews)
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
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TTextNode]
  }
}

