package typings.antd.libFormFormItemMod

import typings.antd.antdStrings._empty
import typings.antd.antdStrings.error
import typings.antd.antdStrings.success
import typings.antd.antdStrings.validating
import typings.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItem
  extends Component[FormItemProps, js.Any, js.Any] {
  var helpShow: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormItem(): Unit = js.native
  def getChildProp(prop: String): js.Any = js.native
  def getControls(children: ReactNode, recursively: Boolean): js.Array[ReactElement] = js.native
  def getField(): js.Any = js.native
  def getHelpMessage(): js.UndefOr[js.Object | Null] = js.native
  def getId(): js.Any = js.native
  def getMeta(): js.Any = js.native
  def getOnlyControl(): ReactElement | Null = js.native
  def getValidateStatus(): _empty | error | success | validating = js.native
  def isRequired(): js.Any = js.native
  def onHelpAnimEnd(_key: String, helpShow: Boolean): Unit = js.native
  def onLabelClick(): Unit = js.native
  def renderChildren(prefixCls: String): js.Array[Element] = js.native
  def renderExtra(prefixCls: String): Element | Null = js.native
  def renderFormItem(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderHelp(prefixCls: String): Element = js.native
  def renderLabel(prefixCls: String): Element = js.native
  def renderValidateWrapper(prefixCls: String, c1: ReactNode, c2: ReactNode, c3: ReactNode): Element = js.native
  def renderWrapper(prefixCls: String, children: ReactNode): Element = js.native
}

