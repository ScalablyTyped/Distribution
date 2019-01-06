package typings
package antdLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends reactLib.reactMod.Component[AlertProps, AlertState, js.Any] {
  @JSName("state")
  var state_Alert: AlertState = js.native
  def animationEnd(): scala.Unit = js.native
  def handleClose(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.MouseEvent]): scala.Unit = js.native
  def renderAlert(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}

