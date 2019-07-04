package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵangular_packages_core_core_bg
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_ɵangular_packages_core_core_bg: ɵangular_packages_core_core_bg | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | scala.Null
  /**
    * Element nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using viewData[HOST_NODE]).
    */
  @JSName("parent")
  var parent_ɵangular_packages_core_core_bg: ɵangular_packages_core_core_bg | TElementContainerNode | scala.Null
  /**
    * If this is a component TNode with projection, this will be an array of projected
    * TNodes or native nodes (see TNode.projection for more info). If it's a regular element node or
    * a component without projection, it will be null.
    */
  @JSName("projection")
  var projection_ɵangular_packages_core_core_bg: (js.Array[TNode | js.Array[RNode]]) | scala.Null
  @JSName("tViews")
  var tViews_ɵangular_packages_core_core_bg: scala.Null
}

object ɵangular_packages_core_core_bg {
  @scala.inline
  def apply(
    directiveEnd: scala.Double,
    directiveStart: scala.Double,
    flags: TNodeFlags,
    index: scala.Double,
    injectorIndex: scala.Double,
    propertyMetadataEndIndex: scala.Double,
    propertyMetadataStartIndex: scala.Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: scala.Null,
    `type`: TNodeType,
    attrs: atAngularCoreLib.TAttributes = null,
    child: ɵangular_packages_core_core_bg | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode = null,
    initialInputs: atAngularCoreLib.InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[java.lang.String | scala.Double] = null,
    newClasses: TStylingContext = null,
    newStyles: TStylingContext = null,
    next: TNode = null,
    onElementCreationFns: js.Array[js.Function] = null,
    outputs: PropertyAliases = null,
    parent: ɵangular_packages_core_core_bg | TElementContainerNode = null,
    projection: js.Array[TNode | js.Array[RNode]] = null,
    projectionNext: TNode = null,
    stylingTemplate: StylingContext = null,
    tagName: java.lang.String = null
  ): ɵangular_packages_core_core_bg = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes, tViews = tViews)
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
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext)
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[ɵangular_packages_core_core_bg]
  }
}

