package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMLEvaluationTaskRunResponse extends js.Object {
  /**
    * The unique identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartMLEvaluationTaskRunResponse {
  @scala.inline
  def apply(TaskRunId: HashString = null): StartMLEvaluationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMLEvaluationTaskRunResponse]
  }
}

