package typings
package antdLib.esFormFormItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItem
  extends reactLib.reactMod.Component[FormItemProps, js.Any, js.Any] {
  var helpShow: scala.Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormItem(): scala.Unit = js.native
  def getChildProp(prop: java.lang.String): js.Any = js.native
  def getControls(children: reactLib.reactMod.ReactNode, recursively: scala.Boolean): js.Array[reactLib.reactMod.ReactElement] = js.native
  def getField(): js.Any = js.native
  def getHelpMessage(): js.UndefOr[js.Object | scala.Null] = js.native
  def getId(): js.Any = js.native
  def getMeta(): js.Any = js.native
  def getOnlyControl(): reactLib.reactMod.ReactElement | scala.Null = js.native
  def getValidateStatus(): antdLib.antdLibStrings.error | antdLib.antdLibStrings.Empty | antdLib.antdLibStrings.success | antdLib.antdLibStrings.validating = js.native
  def isRequired(): js.Any = js.native
  def onHelpAnimEnd(_key: java.lang.String, helpShow: scala.Boolean): scala.Unit = js.native
  def onLabelClick(): scala.Unit = js.native
  def renderChildren(prefixCls: java.lang.String): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def renderExtra(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderFormItem(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderHelp(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderLabel(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderValidateWrapper(
    prefixCls: java.lang.String,
    c1: reactLib.reactMod.ReactNode,
    c2: reactLib.reactMod.ReactNode,
    c3: reactLib.reactMod.ReactNode
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderWrapper(prefixCls: java.lang.String, children: reactLib.reactMod.ReactNode): reactLib.reactMod.Global.JSXNs.Element = js.native
}

