package typings.antd.libAlertMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  def animationEnd(): Unit = js.native
  def handleClose(e: MouseEvent[HTMLAnchorElement, typings.std.MouseEvent]): Unit = js.native
  def renderAlert(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
}

