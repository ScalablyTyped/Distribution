package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CustomerGatewayId] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayId] = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typings.awsDashSdk.clientsEc2Mod.VpnConnectionId = js.native
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnGatewayId] = js.native
}

object ModifyVpnConnectionRequest {
  @scala.inline
  def apply(
    VpnConnectionId: VpnConnectionId,
    CustomerGatewayId: CustomerGatewayId = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TransitGatewayId: TransitGatewayId = null,
    VpnGatewayId: VpnGatewayId = null
  ): ModifyVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    if (CustomerGatewayId != null) __obj.updateDynamic("CustomerGatewayId")(CustomerGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnConnectionRequest]
  }
}

