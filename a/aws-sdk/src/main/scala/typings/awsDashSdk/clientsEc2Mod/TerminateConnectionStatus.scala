package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateConnectionStatus extends js.Object {
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.undefined
  /**
    * A message about the status of the client connection, if applicable.
    */
  var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus] = js.undefined
  /**
    * The state of the client connection.
    */
  var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus] = js.undefined
}

object TerminateConnectionStatus {
  @scala.inline
  def apply(
    ConnectionId: String = null,
    CurrentStatus: ClientVpnConnectionStatus = null,
    PreviousStatus: ClientVpnConnectionStatus = null
  ): TerminateConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (ConnectionId != null) __obj.updateDynamic("ConnectionId")(ConnectionId)
    if (CurrentStatus != null) __obj.updateDynamic("CurrentStatus")(CurrentStatus)
    if (PreviousStatus != null) __obj.updateDynamic("PreviousStatus")(PreviousStatus)
    __obj.asInstanceOf[TerminateConnectionStatus]
  }
}

