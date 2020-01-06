package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEgressOnlyInternetGatewaysRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more egress-only internet gateway IDs.
    */
  var EgressOnlyInternetGatewayIds: js.UndefOr[EgressOnlyInternetGatewayIdList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeEgressOnlyInternetGatewaysMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (EgressOnlyInternetGatewayIds != null) __obj.updateDynamic("EgressOnlyInternetGatewayIds")(EgressOnlyInternetGatewayIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEgressOnlyInternetGatewaysRequest]
  }
}

