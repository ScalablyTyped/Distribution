package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientVpnRouteRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint to which to add the route.
    */
  var ClientVpnEndpointId: String
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The IPv4 address range, in CIDR notation, of the route destination. For example:   To add a route for Internet access, enter 0.0.0.0/0    To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range   To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range   Route address ranges cannot overlap with the CIDR range specified for client allocation.
    */
  var DestinationCidrBlock: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the subnet through which you want to route traffic. The specified subnet must be an existing target network of the Client VPN endpoint.
    */
  var TargetVpcSubnetId: String
}

object CreateClientVpnRouteRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    DestinationCidrBlock: String,
    TargetVpcSubnetId: String,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): CreateClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId, DestinationCidrBlock = DestinationCidrBlock, TargetVpcSubnetId = TargetVpcSubnetId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateClientVpnRouteRequest]
  }
}

