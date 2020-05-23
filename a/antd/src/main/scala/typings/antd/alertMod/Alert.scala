package typings.antd.alertMod

import typings.antd.anon.Closed
import typings.antd.anon.PickAntdIconPropschildren
import typings.antd.anon.PrefixCls
import typings.antd.antdStrings.error
import typings.antd.antdStrings.info
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warning
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  @JSName("state")
  var state_Alert: Closed = js.native
  def animationEnd(): Unit = js.native
  def getClosable(): js.UndefOr[Boolean] = js.native
  def getIconType(): ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  def getShowIcon(): js.UndefOr[Boolean] = js.native
  def getType(): error | success | warning | info = js.native
  def handleClose(e: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
  def renderAlert(hasGetPrefixClsDirection: ConfigConsumerProps): Element | Null = js.native
  def renderCloseIcon(hasPrefixCls: PrefixCls): Element | Null = js.native
  def renderIconNode(hasPrefixCls: PrefixCls): js.UndefOr[js.Object | Null] = js.native
}

