package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMLEvaluationTaskRunResponse extends js.Object {
  /**
    * The unique identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
}

object StartMLEvaluationTaskRunResponse {
  @scala.inline
  def apply(TaskRunId: HashString = null): StartMLEvaluationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId)
    __obj.asInstanceOf[StartMLEvaluationTaskRunResponse]
  }
}

