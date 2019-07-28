package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: String
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[String] = js.undefined
}

object ModifyVpnConnectionRequest {
  @scala.inline
  def apply(
    VpnConnectionId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TransitGatewayId: String = null,
    VpnGatewayId: String = null
  ): ModifyVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId)
    __obj.asInstanceOf[ModifyVpnConnectionRequest]
  }
}

