package typings.antd.esAlertMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  def animationEnd(): Unit = js.native
  def handleClose(e: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def renderAlert(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
}

