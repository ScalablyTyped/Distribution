package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateClientVpnConnectionsRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint to which the client is connected.
    */
  var ClientVpnEndpointId: String
  /**
    * The ID of the client connection to be terminated.
    */
  var ConnectionId: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the user who initiated the connection. Use this option to terminate all active connections for the specified user. This option can only be used if the user has established up to five connections.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object TerminateClientVpnConnectionsRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    ConnectionId: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Username: String = null
  ): TerminateClientVpnConnectionsRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId)
    if (ConnectionId != null) __obj.updateDynamic("ConnectionId")(ConnectionId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[TerminateClientVpnConnectionsRequest]
  }
}

