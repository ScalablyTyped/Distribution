package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnTunnelCertificateRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AWS Site-to-Site VPN connection.
    */
  var VpnConnectionId: String
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String
}

object ModifyVpnTunnelCertificateRequest {
  @scala.inline
  def apply(
    VpnConnectionId: String,
    VpnTunnelOutsideIpAddress: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyVpnTunnelCertificateRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId, VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyVpnTunnelCertificateRequest]
  }
}

