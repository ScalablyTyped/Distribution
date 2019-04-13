package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTransitGatewayRouteTablesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. The possible values are:    default-association-route-table - Indicates whether this is the default association route table for the transit gateway (true | false).    default-propagation-route-table - Indicates whether this is the default propagation route table for the transit gateway (true | false).    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-id - The ID of the transit gateway.    transit-gateway-route-table-id - The ID of the transit gateway route table.  
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
    * The IDs of the transit gateway route tables.
    */
  var TransitGatewayRouteTableIds: js.UndefOr[TransitGatewayRouteTableIdStringList] = js.undefined
}

object DescribeTransitGatewayRouteTablesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined,
    NextToken: String = null,
    TransitGatewayRouteTableIds: TransitGatewayRouteTableIdStringList = null
  ): DescribeTransitGatewayRouteTablesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TransitGatewayRouteTableIds != null) __obj.updateDynamic("TransitGatewayRouteTableIds")(TransitGatewayRouteTableIds)
    __obj.asInstanceOf[DescribeTransitGatewayRouteTablesRequest]
  }
}

