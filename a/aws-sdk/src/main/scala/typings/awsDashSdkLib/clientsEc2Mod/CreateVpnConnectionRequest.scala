package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The options for the VPN connection.
    */
  var Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.undefined
  /**
    * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The type of VPN connection (ipsec.1 | ipsec.2).
    */
  var Type: String
  /**
    * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.undefined
}

object CreateVpnConnectionRequest {
  @scala.inline
  def apply(
    CustomerGatewayId: String,
    Type: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Options: VpnConnectionOptionsSpecification = null,
    TransitGatewayId: String = null,
    VpnGatewayId: String = null
  ): CreateVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId, Type = Type)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId)
    __obj.asInstanceOf[CreateVpnConnectionRequest]
  }
}

