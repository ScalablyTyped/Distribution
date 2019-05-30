package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowExecutionTasksRequest extends js.Object {
  /**
    * Optional filters used to scope down the returned tasks. The supported filter key is STATUS with the corresponding values PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED. 
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID of the maintenance window execution whose task executions should be retrieved.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}

object DescribeMaintenanceWindowExecutionTasksRequest {
  @scala.inline
  def apply(
    WindowExecutionId: MaintenanceWindowExecutionId,
    Filters: MaintenanceWindowFilterList = null,
    MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowExecutionTasksRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
  }
}

