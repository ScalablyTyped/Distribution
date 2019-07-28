package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowTasksRequest extends js.Object {
  /**
    * Optional filters used to narrow down the scope of the returned tasks. The supported filter keys are WindowTaskId, TaskArn, Priority, and TaskType.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * The ID of the maintenance window whose tasks should be retrieved.
    */
  var WindowId: MaintenanceWindowId
}

object DescribeMaintenanceWindowTasksRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    Filters: MaintenanceWindowFilterList = null,
    MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowTasksRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMaintenanceWindowTasksRequest]
  }
}

