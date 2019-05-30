package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the target was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The ID of the removed target definition.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}

object DeregisterTargetFromMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null, WindowTargetId: MaintenanceWindowTargetId = null): DeregisterTargetFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId)
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
  }
}

