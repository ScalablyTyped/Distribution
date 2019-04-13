package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateClientVpnConnectionsResult extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the client connections.
    */
  var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet] = js.undefined
  /**
    * The user who established the terminated client connections.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object TerminateClientVpnConnectionsResult {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String = null,
    ConnectionStatuses: TerminateConnectionStatusSet = null,
    Username: String = null
  ): TerminateClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId)
    if (ConnectionStatuses != null) __obj.updateDynamic("ConnectionStatuses")(ConnectionStatuses)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[TerminateClientVpnConnectionsResult]
  }
}

