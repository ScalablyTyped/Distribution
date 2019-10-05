package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTransitGatewayRouteRequest extends js.Object {
  /**
    * The CIDR range for the route. This must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: String
}

object DeleteTransitGatewayRouteRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    TransitGatewayRouteTableId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteTransitGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock, TransitGatewayRouteTableId = TransitGatewayRouteTableId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteTransitGatewayRouteRequest]
  }
}

