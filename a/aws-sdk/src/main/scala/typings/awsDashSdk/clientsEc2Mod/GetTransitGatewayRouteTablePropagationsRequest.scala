package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayRouteTablePropagationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. The possible values are:    resource-id - The ID of the resource.    resource-type - The resource type (vpc | vpn).    transit-gateway-attachment-id - The ID of the attachment.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: String
}

object GetTransitGatewayRouteTablePropagationsRequest {
  @scala.inline
  def apply(
    TransitGatewayRouteTableId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): GetTransitGatewayRouteTablePropagationsRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayRouteTableId = TransitGatewayRouteTableId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetTransitGatewayRouteTablePropagationsRequest]
  }
}

