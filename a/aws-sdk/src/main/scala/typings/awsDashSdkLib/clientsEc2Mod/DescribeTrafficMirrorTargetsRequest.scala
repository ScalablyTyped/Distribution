package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrafficMirrorTargetsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. The possible values are:    description: The Traffic Mirror target description.    network-interface-id: The ID of the Traffic Mirror session network interface.    network-load-balancer-arn: The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the session.    owner-id: The ID of the account that owns the Traffic Mirror session.    traffic-mirror-target-id: The ID of the Traffic Mirror target.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TrafficMirroringMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID of the Traffic Mirror targets.
    */
  var TrafficMirrorTargetIds: js.UndefOr[ValueStringList] = js.undefined
}

object DescribeTrafficMirrorTargetsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[TrafficMirroringMaxResults] = js.undefined,
    NextToken: NextToken = null,
    TrafficMirrorTargetIds: ValueStringList = null
  ): DescribeTrafficMirrorTargetsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TrafficMirrorTargetIds != null) __obj.updateDynamic("TrafficMirrorTargetIds")(TrafficMirrorTargetIds)
    __obj.asInstanceOf[DescribeTrafficMirrorTargetsRequest]
  }
}

