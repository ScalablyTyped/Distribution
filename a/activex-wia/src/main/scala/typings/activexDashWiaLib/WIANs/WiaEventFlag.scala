package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiaEventFlag extends js.Object

/**
     * A DeviceEvent's type is composed of bits from the WiaEventFlags enumeration. You can test a DeviceEvent's type by using the AND operation with
     * DeviceEvent.Type and a member from the WiaEventFlags enumeration.
     */
@JSGlobal("WIA.WiaEventFlag")
@js.native
object WiaEventFlag extends js.Object {
  @js.native
  sealed trait ActionEvent
    extends activexDashWiaLib.WIANs.WiaEventFlag
  
  @js.native
  sealed trait NotificationEvent
    extends activexDashWiaLib.WIANs.WiaEventFlag
  
  /* 2 */ val ActionEvent: ActionEvent with scala.Double = js.native
  /* 1 */ val NotificationEvent: NotificationEvent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWiaLib.WIANs.WiaEventFlag with scala.Double] = js.native
}

