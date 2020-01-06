package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnTunnelOptionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The tunnel options to modify.
    */
  var TunnelOptions: ModifyVpnTunnelOptionsSpecification = js.native
  /**
    * The ID of the AWS Site-to-Site VPN connection.
    */
  var VpnConnectionId: typings.awsDashSdk.clientsEc2Mod.VpnConnectionId = js.native
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String = js.native
}

object ModifyVpnTunnelOptionsRequest {
  @scala.inline
  def apply(
    TunnelOptions: ModifyVpnTunnelOptionsSpecification,
    VpnConnectionId: VpnConnectionId,
    VpnTunnelOutsideIpAddress: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyVpnTunnelOptionsRequest = {
    val __obj = js.Dynamic.literal(TunnelOptions = TunnelOptions.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelOptionsRequest]
  }
}

