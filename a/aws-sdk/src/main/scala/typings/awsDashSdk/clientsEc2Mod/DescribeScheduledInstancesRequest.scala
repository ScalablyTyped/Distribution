package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    availability-zone - The Availability Zone (for example, us-west-2a).    instance-type - The instance type (for example, c4.large).    network-platform - The network platform (EC2-Classic or EC2-VPC).    platform - The platform (Linux/UNIX or Windows).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value is 100. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The Scheduled Instance IDs.
    */
  var ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet] = js.native
  /**
    * The time period for the first schedule to start.
    */
  var SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest] = js.native
}

object DescribeScheduledInstancesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    ScheduledInstanceIds: ScheduledInstanceIdRequestSet = null,
    SlotStartTimeRange: SlotStartTimeRangeRequest = null
  ): DescribeScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledInstanceIds != null) __obj.updateDynamic("ScheduledInstanceIds")(ScheduledInstanceIds.asInstanceOf[js.Any])
    if (SlotStartTimeRange != null) __obj.updateDynamic("SlotStartTimeRange")(SlotStartTimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledInstancesRequest]
  }
}

