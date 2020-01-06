package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImportLabelsTaskRunResponse extends js.Object {
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartImportLabelsTaskRunResponse {
  @scala.inline
  def apply(TaskRunId: HashString = null): StartImportLabelsTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportLabelsTaskRunResponse]
  }
}

