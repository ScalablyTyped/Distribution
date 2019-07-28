package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExportTaskResponse extends js.Object {
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.undefined
}

object CreateExportTaskResponse {
  @scala.inline
  def apply(taskId: ExportTaskId = null): CreateExportTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[CreateExportTaskResponse]
  }
}

