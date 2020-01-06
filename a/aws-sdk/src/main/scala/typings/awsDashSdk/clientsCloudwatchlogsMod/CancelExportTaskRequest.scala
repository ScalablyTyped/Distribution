package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelExportTaskRequest extends js.Object {
  /**
    * The ID of the export task.
    */
  var taskId: ExportTaskId = js.native
}

object CancelExportTaskRequest {
  @scala.inline
  def apply(taskId: ExportTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
}

