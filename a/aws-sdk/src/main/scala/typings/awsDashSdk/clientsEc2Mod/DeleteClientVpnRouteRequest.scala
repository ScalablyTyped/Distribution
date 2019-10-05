package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClientVpnRouteRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint from which the route is to be deleted.
    */
  var ClientVpnEndpointId: String
  /**
    * The IPv4 address range, in CIDR notation, of the route to be deleted.
    */
  var DestinationCidrBlock: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the target subnet used by the route.
    */
  var TargetVpcSubnetId: js.UndefOr[String] = js.undefined
}

object DeleteClientVpnRouteRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    DestinationCidrBlock: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TargetVpcSubnetId: String = null
  ): DeleteClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId, DestinationCidrBlock = DestinationCidrBlock)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TargetVpcSubnetId != null) __obj.updateDynamic("TargetVpcSubnetId")(TargetVpcSubnetId)
    __obj.asInstanceOf[DeleteClientVpnRouteRequest]
  }
}

