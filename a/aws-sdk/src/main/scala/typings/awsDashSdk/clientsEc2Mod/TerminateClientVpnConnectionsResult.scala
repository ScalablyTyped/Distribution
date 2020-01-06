package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateClientVpnConnectionsResult extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The current state of the client connections.
    */
  var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet] = js.native
  /**
    * The user who established the terminated client connections.
    */
  var Username: js.UndefOr[String] = js.native
}

object TerminateClientVpnConnectionsResult {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String = null,
    ConnectionStatuses: TerminateConnectionStatusSet = null,
    Username: String = null
  ): TerminateClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId.asInstanceOf[js.Any])
    if (ConnectionStatuses != null) __obj.updateDynamic("ConnectionStatuses")(ConnectionStatuses.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateClientVpnConnectionsResult]
  }
}

