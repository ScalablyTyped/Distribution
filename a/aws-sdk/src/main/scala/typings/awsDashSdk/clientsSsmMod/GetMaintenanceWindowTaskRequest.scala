package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowTaskRequest extends js.Object {
  /**
    * The maintenance window ID that includes the task to retrieve.
    */
  var WindowId: MaintenanceWindowId
  /**
    * The maintenance window task ID to retrieve.
    */
  var WindowTaskId: MaintenanceWindowTaskId
}

object GetMaintenanceWindowTaskRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): GetMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId, WindowTaskId = WindowTaskId)
  
    __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
  }
}

