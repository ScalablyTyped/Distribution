package typings.antd.alertMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  def animationEnd(): Unit = js.native
  def handleClose(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
  def renderAlert(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
}

