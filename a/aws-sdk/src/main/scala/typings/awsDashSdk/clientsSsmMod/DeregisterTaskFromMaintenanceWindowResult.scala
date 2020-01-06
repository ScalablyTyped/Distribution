package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the task was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the task removed from the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object DeregisterTaskFromMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null, WindowTaskId: MaintenanceWindowTaskId = null): DeregisterTaskFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
  }
}

