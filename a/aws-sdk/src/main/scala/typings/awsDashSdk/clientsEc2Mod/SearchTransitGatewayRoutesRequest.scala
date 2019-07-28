package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTransitGatewayRoutesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. The possible values are:    attachment.transit-gateway-attachment-id- The id of the transit gateway attachment.    attachment.resource-id - The resource id of the transit gateway attachment.    attachment.resource-type - The attachment resource type (vpc | vpn).    route-search.exact-match - The exact match of the specified filter.    route-search.longest-prefix-match - The longest prefix that matches the route.    route-search.subnet-of-match - The routes with a subnet that match the specified CIDR filter.    route-search.supernet-of-match - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.    state - The state of the route (active | blackhole).    type - The type of roue (propagated | static).  
    */
  var Filters: FilterList
  /**
    * The maximum number of routes to return.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: String
}

object SearchTransitGatewayRoutesRequest {
  @scala.inline
  def apply(
    Filters: FilterList,
    TransitGatewayRouteTableId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  ): SearchTransitGatewayRoutesRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters, TransitGatewayRouteTableId = TransitGatewayRouteTableId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    __obj.asInstanceOf[SearchTransitGatewayRoutesRequest]
  }
}

