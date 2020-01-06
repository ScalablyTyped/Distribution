package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowTasksResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * Information about the tasks in the maintenance window.
    */
  var Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.native
}

object DescribeMaintenanceWindowTasksResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Tasks: MaintenanceWindowTaskList = null): DescribeMaintenanceWindowTasksResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowTasksResult]
  }
}

