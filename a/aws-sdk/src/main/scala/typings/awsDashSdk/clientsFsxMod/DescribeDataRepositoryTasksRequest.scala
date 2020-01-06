package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataRepositoryTasksRequest extends js.Object {
  /**
    * (Optional) You can use filters to narrow the DescribeDataRepositoryTasks response to include just tasks for specific file systems, or tasks in a specific lifecycle state.
    */
  var Filters: js.UndefOr[DataRepositoryTaskFilters] = js.native
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsFsxMod.MaxResults] = js.native
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NextToken] = js.native
  /**
    * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
    */
  var TaskIds: js.UndefOr[typings.awsDashSdk.clientsFsxMod.TaskIds] = js.native
}

object DescribeDataRepositoryTasksRequest {
  @scala.inline
  def apply(
    Filters: DataRepositoryTaskFilters = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    TaskIds: TaskIds = null
  ): DescribeDataRepositoryTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TaskIds != null) __obj.updateDynamic("TaskIds")(TaskIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataRepositoryTasksRequest]
  }
}

