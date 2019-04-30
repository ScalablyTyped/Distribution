package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScheduledInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The filters.    availability-zone - The Availability Zone (for example, us-west-2a).    instance-type - The instance type (for example, c4.large).    network-platform - The network platform (EC2-Classic or EC2-VPC).    platform - The platform (Linux/UNIX or Windows).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value is 100. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The Scheduled Instance IDs.
    */
  var ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet] = js.undefined
  /**
    * The time period for the first schedule to start.
    */
  var SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest] = js.undefined
}

object DescribeScheduledInstancesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    ScheduledInstanceIds: ScheduledInstanceIdRequestSet = null,
    SlotStartTimeRange: SlotStartTimeRangeRequest = null
  ): DescribeScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScheduledInstanceIds != null) __obj.updateDynamic("ScheduledInstanceIds")(ScheduledInstanceIds)
    if (SlotStartTimeRange != null) __obj.updateDynamic("SlotStartTimeRange")(SlotStartTimeRange)
    __obj.asInstanceOf[DescribeScheduledInstancesRequest]
  }
}

