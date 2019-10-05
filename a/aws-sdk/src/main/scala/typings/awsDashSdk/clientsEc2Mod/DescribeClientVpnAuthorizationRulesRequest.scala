package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientVpnAuthorizationRulesRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. Filter names and values are case-sensitive.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeClientVpnAuthorizationRulesMaxResults] = js.undefined
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.undefined
}

object DescribeClientVpnAuthorizationRulesRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null
  ): DescribeClientVpnAuthorizationRulesRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClientVpnAuthorizationRulesRequest]
  }
}

