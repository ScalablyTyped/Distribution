package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeByoipCidrsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: DescribeByoipCidrsMaxResults
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeByoipCidrsRequest {
  @scala.inline
  def apply(
    MaxResults: DescribeByoipCidrsMaxResults,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    NextToken: NextToken = null
  ): DescribeByoipCidrsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeByoipCidrsRequest]
  }
}

