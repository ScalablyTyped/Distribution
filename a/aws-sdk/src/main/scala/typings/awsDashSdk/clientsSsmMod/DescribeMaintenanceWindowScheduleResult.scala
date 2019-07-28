package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowScheduleResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Information about maintenance window executions scheduled for the specified time range.
    */
  var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined
}

object DescribeMaintenanceWindowScheduleResult {
  @scala.inline
  def apply(NextToken: NextToken = null, ScheduledWindowExecutions: ScheduledWindowExecutionList = null): DescribeMaintenanceWindowScheduleResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScheduledWindowExecutions != null) __obj.updateDynamic("ScheduledWindowExecutions")(ScheduledWindowExecutions)
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
  }
}

