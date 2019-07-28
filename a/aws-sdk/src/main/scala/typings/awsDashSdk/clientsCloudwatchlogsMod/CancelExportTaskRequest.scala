package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelExportTaskRequest extends js.Object {
  /**
    * The ID of the export task.
    */
  var taskId: ExportTaskId
}

object CancelExportTaskRequest {
  @scala.inline
  def apply(taskId: ExportTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
}

