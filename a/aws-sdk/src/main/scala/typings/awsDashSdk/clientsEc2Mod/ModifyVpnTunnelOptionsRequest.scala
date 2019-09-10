package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnTunnelOptionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The tunnel options to modify.
    */
  var TunnelOptions: ModifyVpnTunnelOptionsSpecification
  /**
    * The ID of the AWS Site-to-Site VPN connection.
    */
  var VpnConnectionId: String
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String
}

object ModifyVpnTunnelOptionsRequest {
  @scala.inline
  def apply(
    TunnelOptions: ModifyVpnTunnelOptionsSpecification,
    VpnConnectionId: String,
    VpnTunnelOutsideIpAddress: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyVpnTunnelOptionsRequest = {
    val __obj = js.Dynamic.literal(TunnelOptions = TunnelOptions, VpnConnectionId = VpnConnectionId, VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyVpnTunnelOptionsRequest]
  }
}

