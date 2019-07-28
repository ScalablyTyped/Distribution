package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
  /**
    * The invocation ID to retrieve.
    */
  var InvocationId: MaintenanceWindowExecutionTaskInvocationId
  /**
    * The ID of the specific task in the maintenance window task that should be retrieved. 
    */
  var TaskId: MaintenanceWindowExecutionTaskId
  /**
    * The ID of the maintenance window execution for which the task is a part.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}

object GetMaintenanceWindowExecutionTaskInvocationRequest {
  @scala.inline
  def apply(
    InvocationId: MaintenanceWindowExecutionTaskInvocationId,
    TaskId: MaintenanceWindowExecutionTaskId,
    WindowExecutionId: MaintenanceWindowExecutionId
  ): GetMaintenanceWindowExecutionTaskInvocationRequest = {
    val __obj = js.Dynamic.literal(InvocationId = InvocationId, TaskId = TaskId, WindowExecutionId = WindowExecutionId)
  
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
  }
}

