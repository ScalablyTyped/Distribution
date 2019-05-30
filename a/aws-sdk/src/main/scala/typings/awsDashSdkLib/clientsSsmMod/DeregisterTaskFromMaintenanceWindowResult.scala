package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the task was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The ID of the task removed from the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}

object DeregisterTaskFromMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null, WindowTaskId: MaintenanceWindowTaskId = null): DeregisterTaskFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId)
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
  }
}

