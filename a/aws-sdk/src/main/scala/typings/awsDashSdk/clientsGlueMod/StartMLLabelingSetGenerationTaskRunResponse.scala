package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMLLabelingSetGenerationTaskRunResponse extends js.Object {
  /**
    * The unique run identifier that is associated with this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartMLLabelingSetGenerationTaskRunResponse {
  @scala.inline
  def apply(TaskRunId: HashString = null): StartMLLabelingSetGenerationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunResponse]
  }
}

