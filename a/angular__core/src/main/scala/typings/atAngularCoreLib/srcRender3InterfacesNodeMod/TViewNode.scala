package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TViewNode extends TNode {
  @JSName("child")
  var child_TViewNode: TElementNode | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | scala.Null
  @JSName("parent")
  var parent_TViewNode: TContainerNode | scala.Null
  @JSName("projection")
  var projection_TViewNode: scala.Null
  @JSName("tViews")
  var tViews_TViewNode: scala.Null
}

object TViewNode {
  @scala.inline
  def apply(
    directiveEnd: scala.Double,
    directiveStart: scala.Double,
    flags: TNodeFlags,
    index: scala.Double,
    injectorIndex: scala.Double,
    projection: scala.Null,
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
    parent: TContainerNode = null,
    stylingTemplate: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = null,
    tagName: java.lang.String = null
  ): TViewNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("directiveEnd")(directiveEnd)
    __obj.updateDynamic("directiveStart")(directiveStart)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("injectorIndex")(injectorIndex)
    __obj.updateDynamic("projection")(projection)
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
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TViewNode]
  }
}

