package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStaleSecurityGroupsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of items to return for this request. The request returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[DescribeStaleSecurityGroupsMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a prior call.)
    */
  var NextToken: js.UndefOr[DescribeStaleSecurityGroupsNextToken] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object DescribeStaleSecurityGroupsRequest {
  @scala.inline
  def apply(
    VpcId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    MaxResults: Int | scala.Double = null,
    NextToken: DescribeStaleSecurityGroupsNextToken = null
  ): DescribeStaleSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeStaleSecurityGroupsRequest]
  }
}

