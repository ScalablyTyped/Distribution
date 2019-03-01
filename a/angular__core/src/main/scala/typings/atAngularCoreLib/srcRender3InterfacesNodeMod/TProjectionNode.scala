package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TProjectionNode extends TNode {
  /** Index in the data[] array */
  @JSName("child")
  var child_TProjectionNode: scala.Null
  /**
    * Projection nodes will have parents unless they are the first node of a component
    * or embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TProjectionNode: TElementNode | TElementContainerNode | scala.Null
  /** Index of the projection node. (See TNode.projection for more info.) */
  @JSName("projection")
  var projection_TProjectionNode: scala.Double
  @JSName("tViews")
  var tViews_TProjectionNode: scala.Null
}

object TProjectionNode {
  @scala.inline
  def apply(
    child: scala.Null,
    directiveEnd: scala.Double,
    directiveStart: scala.Double,
    flags: TNodeFlags,
    index: scala.Double,
    injectorIndex: scala.Double,
    projection: scala.Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: scala.Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[java.lang.String | scala.Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: TElementNode | TElementContainerNode = null,
    stylingTemplate: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = null,
    tagName: java.lang.String = null
  ): TProjectionNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("child")(child)
    __obj.updateDynamic("directiveEnd")(directiveEnd)
    __obj.updateDynamic("directiveStart")(directiveStart)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("injectorIndex")(injectorIndex)
    __obj.updateDynamic("projection")(projection)
    __obj.updateDynamic("providerIndexes")(providerIndexes)
    __obj.updateDynamic("tViews")(tViews)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (next != null) __obj.updateDynamic("next")(next)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TProjectionNode]
  }
}

