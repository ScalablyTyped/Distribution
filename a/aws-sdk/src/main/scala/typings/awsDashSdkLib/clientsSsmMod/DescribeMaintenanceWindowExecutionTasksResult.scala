package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the task executions.
    */
  var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined
}

object DescribeMaintenanceWindowExecutionTasksResult {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    WindowExecutionTaskIdentities: MaintenanceWindowExecutionTaskIdentityList = null
  ): DescribeMaintenanceWindowExecutionTasksResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WindowExecutionTaskIdentities != null) __obj.updateDynamic("WindowExecutionTaskIdentities")(WindowExecutionTaskIdentities)
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
  }
}

