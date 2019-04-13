package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
  /**
    * The ID of the specific task execution in the Maintenance Window task that should be retrieved.
    */
  var TaskId: MaintenanceWindowExecutionTaskId
  /**
    * The ID of the Maintenance Window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}

object GetMaintenanceWindowExecutionTaskRequest {
  @scala.inline
  def apply(TaskId: MaintenanceWindowExecutionTaskId, WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId, WindowExecutionId = WindowExecutionId)
  
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
  }
}

