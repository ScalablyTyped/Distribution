package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceTransitGatewayRouteRequest extends js.Object {
  /**
    * Indicates whether traffic matching this route is to be dropped.
    */
  var Blackhole: js.UndefOr[Boolean] = js.native
  /**
    * The CIDR range used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
  /**
    * The ID of the route table.
    */
  var TransitGatewayRouteTableId: String = js.native
}

object ReplaceTransitGatewayRouteRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    TransitGatewayRouteTableId: String,
    Blackhole: js.UndefOr[scala.Boolean] = js.undefined,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TransitGatewayAttachmentId: String = null
  ): ReplaceTransitGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(Blackhole)) __obj.updateDynamic("Blackhole")(Blackhole.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceTransitGatewayRouteRequest]
  }
}

