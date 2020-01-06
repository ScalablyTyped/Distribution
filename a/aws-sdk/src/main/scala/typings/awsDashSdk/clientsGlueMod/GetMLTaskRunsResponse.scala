package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTaskRunsResponse extends js.Object {
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of task runs that are associated with the transform.
    */
  var TaskRuns: js.UndefOr[TaskRunList] = js.native
}

object GetMLTaskRunsResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, TaskRuns: TaskRunList = null): GetMLTaskRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TaskRuns != null) __obj.updateDynamic("TaskRuns")(TaskRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunsResponse]
  }
}

