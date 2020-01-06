package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typings.awsDashSdk.clientsEc2Mod.CustomerGatewayId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The options for the VPN connection.
    */
  var Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.native
  /**
    * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayId] = js.native
  /**
    * The type of VPN connection (ipsec.1).
    */
  var Type: String = js.native
  /**
    * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit gateway.
    */
  var VpnGatewayId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnGatewayId] = js.native
}

object CreateVpnConnectionRequest {
  @scala.inline
  def apply(
    CustomerGatewayId: CustomerGatewayId,
    Type: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Options: VpnConnectionOptionsSpecification = null,
    TransitGatewayId: TransitGatewayId = null,
    VpnGatewayId: VpnGatewayId = null
  ): CreateVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnConnectionRequest]
  }
}

