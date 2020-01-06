package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExportLabelsTaskRunResponse extends js.Object {
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartExportLabelsTaskRunResponse {
  @scala.inline
  def apply(TaskRunId: HashString = null): StartExportLabelsTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportLabelsTaskRunResponse]
  }
}

