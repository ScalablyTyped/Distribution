package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
  /**
    * The invocation ID to retrieve.
    */
  var InvocationId: MaintenanceWindowExecutionTaskInvocationId = js.native
  /**
    * The ID of the specific task in the maintenance window task that should be retrieved. 
    */
  var TaskId: MaintenanceWindowExecutionTaskId = js.native
  /**
    * The ID of the maintenance window execution for which the task is a part.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}

object GetMaintenanceWindowExecutionTaskInvocationRequest {
  @scala.inline
  def apply(
    InvocationId: MaintenanceWindowExecutionTaskInvocationId,
    TaskId: MaintenanceWindowExecutionTaskId,
    WindowExecutionId: MaintenanceWindowExecutionId
  ): GetMaintenanceWindowExecutionTaskInvocationRequest = {
    val __obj = js.Dynamic.literal(InvocationId = InvocationId.asInstanceOf[js.Any], TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
  }
}

