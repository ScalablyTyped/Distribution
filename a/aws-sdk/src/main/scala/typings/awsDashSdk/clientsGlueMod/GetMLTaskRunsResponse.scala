package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTaskRunsResponse extends js.Object {
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of task runs that are associated with the transform.
    */
  var TaskRuns: js.UndefOr[TaskRunList] = js.undefined
}

object GetMLTaskRunsResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, TaskRuns: TaskRunList = null): GetMLTaskRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TaskRuns != null) __obj.updateDynamic("TaskRuns")(TaskRuns)
    __obj.asInstanceOf[GetMLTaskRunsResponse]
  }
}

