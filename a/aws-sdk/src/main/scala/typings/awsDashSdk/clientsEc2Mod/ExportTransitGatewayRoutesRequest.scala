package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTransitGatewayRoutesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. The possible values are:    attachment.transit-gateway-attachment-id - The id of the transit gateway attachment.    attachment.resource-id - The resource id of the transit gateway attachment.    route-search.exact-match - The exact match of the specified filter.    route-search.longest-prefix-match - The longest prefix that matches the route.    route-search.subnet-of-match - The routes with a subnet that match the specified CIDR filter.    route-search.supernet-of-match - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-route-destination-cidr-block - The CIDR range.    type - The type of route (active | blackhole).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The name of the S3 bucket.
    */
  var S3Bucket: String
  /**
    * The ID of the route table.
    */
  var TransitGatewayRouteTableId: String
}

object ExportTransitGatewayRoutesRequest {
  @scala.inline
  def apply(
    S3Bucket: String,
    TransitGatewayRouteTableId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null
  ): ExportTransitGatewayRoutesRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket, TransitGatewayRouteTableId = TransitGatewayRouteTableId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    __obj.asInstanceOf[ExportTransitGatewayRoutesRequest]
  }
}

