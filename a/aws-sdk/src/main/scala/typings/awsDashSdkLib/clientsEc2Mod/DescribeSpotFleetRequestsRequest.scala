package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSpotFleetRequestsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: js.UndefOr[ValueStringList] = js.undefined
}

object DescribeSpotFleetRequestsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    SpotFleetRequestIds: ValueStringList = null
  ): DescribeSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SpotFleetRequestIds != null) __obj.updateDynamic("SpotFleetRequestIds")(SpotFleetRequestIds)
    __obj.asInstanceOf[DescribeSpotFleetRequestsRequest]
  }
}

