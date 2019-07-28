package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowExecutionRequest extends js.Object {
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}

object GetMaintenanceWindowExecutionRequest {
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId)
  
    __obj.asInstanceOf[GetMaintenanceWindowExecutionRequest]
  }
}

