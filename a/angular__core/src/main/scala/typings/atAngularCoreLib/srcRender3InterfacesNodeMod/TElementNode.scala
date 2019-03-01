package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TElementNode
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_TElementNode: TElementNode | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | scala.Null
  /**
    * Element nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using viewData[HOST_NODE]).
    */
  @JSName("parent")
  var parent_TElementNode: TElementNode | TElementContainerNode | scala.Null
  /**
    * If this is a component TNode with projection, this will be an array of projected
    * TNodes (see TNode.projection for more info). If it's a regular element node or a
    * component without projection, it will be null.
    */
  @JSName("projection")
  var projection_TElementNode: (js.Array[TNode | scala.Null]) | scala.Null
  @JSName("tViews")
  var tViews_TElementNode: scala.Null
}

object TElementNode {
  @scala.inline
  def apply(
    directiveEnd: scala.Double,
    directiveStart: scala.Double,
    flags: TNodeFlags,
    index: scala.Double,
    injectorIndex: scala.Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: scala.Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: TElementNode | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[java.lang.String | scala.Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: TElementNode | TElementContainerNode = null,
    projection: js.Array[TNode | scala.Null] = null,
    stylingTemplate: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = null,
    tagName: java.lang.String = null
  ): TElementNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("directiveEnd")(directiveEnd)
    __obj.updateDynamic("directiveStart")(directiveStart)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("injectorIndex")(injectorIndex)
    __obj.updateDynamic("providerIndexes")(providerIndexes)
    __obj.updateDynamic("tViews")(tViews)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (next != null) __obj.updateDynamic("next")(next)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TElementNode]
  }
}

