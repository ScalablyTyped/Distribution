package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpnConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: String
}

object DeleteVpnConnectionRequest {
  @scala.inline
  def apply(VpnConnectionId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteVpnConnectionRequest]
  }
}

