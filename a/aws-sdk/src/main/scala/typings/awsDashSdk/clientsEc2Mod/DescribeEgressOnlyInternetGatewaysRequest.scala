package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEgressOnlyInternetGatewaysRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more egress-only internet gateway IDs.
    */
  var EgressOnlyInternetGatewayIds: js.UndefOr[EgressOnlyInternetGatewayIdList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeEgressOnlyInternetGatewaysMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeEgressOnlyInternetGatewaysRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EgressOnlyInternetGatewayIds: EgressOnlyInternetGatewayIdList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeEgressOnlyInternetGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (EgressOnlyInternetGatewayIds != null) __obj.updateDynamic("EgressOnlyInternetGatewayIds")(EgressOnlyInternetGatewayIds)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEgressOnlyInternetGatewaysRequest]
  }
}

