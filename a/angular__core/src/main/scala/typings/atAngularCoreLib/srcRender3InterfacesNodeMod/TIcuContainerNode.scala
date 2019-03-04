package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TIcuContainerNode extends TNode {
  /**
    * Indicates the current active case for an ICU expression.
    * It is null when there is no active case.
    */
  var activeCaseIndex: scala.Double | scala.Null
  @JSName("child")
  var child_TIcuContainerNode: TElementNode | TTextNode | scala.Null
  @JSName("parent")
  var parent_TIcuContainerNode: TElementNode | TElementContainerNode | scala.Null
  @JSName("projection")
  var projection_TIcuContainerNode: scala.Null
  @JSName("tViews")
  var tViews_TIcuContainerNode: scala.Null
}

object TIcuContainerNode {
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
    activeCaseIndex: scala.Int | scala.Double = null,
    attrs: TAttributes = null,
    child: TElementNode | TTextNode = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[java.lang.String | scala.Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: TElementNode | TElementContainerNode = null,
    stylingTemplate: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = null,
    tagName: java.lang.String = null
  ): TIcuContainerNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, projection = projection, providerIndexes = providerIndexes, tViews = tViews)
    __obj.updateDynamic("type")(`type`)
    if (activeCaseIndex != null) __obj.updateDynamic("activeCaseIndex")(activeCaseIndex.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (next != null) __obj.updateDynamic("next")(next)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (stylingTemplate != null) __obj.updateDynamic("stylingTemplate")(stylingTemplate)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TIcuContainerNode]
  }
}

