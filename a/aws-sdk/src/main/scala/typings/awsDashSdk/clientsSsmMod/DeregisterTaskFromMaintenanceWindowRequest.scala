package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterTaskFromMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the maintenance window the task should be removed from.
    */
  var WindowId: MaintenanceWindowId
  /**
    * The ID of the task to remove from the maintenance window.
    */
  var WindowTaskId: MaintenanceWindowTaskId
}

object DeregisterTaskFromMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): DeregisterTaskFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId, WindowTaskId = WindowTaskId)
  
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
  }
}

