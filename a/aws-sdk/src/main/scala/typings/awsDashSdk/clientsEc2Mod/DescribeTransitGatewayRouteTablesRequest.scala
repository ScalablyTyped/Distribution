package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayRouteTablesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. The possible values are:    default-association-route-table - Indicates whether this is the default association route table for the transit gateway (true | false).    default-propagation-route-table - Indicates whether this is the default propagation route table for the transit gateway (true | false).    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-id - The ID of the transit gateway.    transit-gateway-route-table-id - The ID of the transit gateway route table.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the transit gateway route tables.
    */
  var TransitGatewayRouteTableIds: js.UndefOr[TransitGatewayRouteTableIdStringList] = js.native
}

object DescribeTransitGatewayRouteTablesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    TransitGatewayRouteTableIds: TransitGatewayRouteTableIdStringList = null
  ): DescribeTransitGatewayRouteTablesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayRouteTableIds != null) __obj.updateDynamic("TransitGatewayRouteTableIds")(TransitGatewayRouteTableIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewayRouteTablesRequest]
  }
}

