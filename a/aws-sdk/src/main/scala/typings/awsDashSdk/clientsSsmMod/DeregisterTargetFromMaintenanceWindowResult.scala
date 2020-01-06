package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the target was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the removed target definition.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object DeregisterTargetFromMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null, WindowTargetId: MaintenanceWindowTargetId = null): DeregisterTargetFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
  }
}

