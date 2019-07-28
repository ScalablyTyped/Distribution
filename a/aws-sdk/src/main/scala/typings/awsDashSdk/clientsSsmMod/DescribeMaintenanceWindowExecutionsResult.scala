package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Information about the maintenance window executions.
    */
  var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined
}

object DescribeMaintenanceWindowExecutionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowExecutions: MaintenanceWindowExecutionList = null): DescribeMaintenanceWindowExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WindowExecutions != null) __obj.updateDynamic("WindowExecutions")(WindowExecutions)
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
  }
}

