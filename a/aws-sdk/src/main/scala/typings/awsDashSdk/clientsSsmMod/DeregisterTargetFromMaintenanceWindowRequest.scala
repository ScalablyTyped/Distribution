package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
  /**
    * The system checks if the target is being referenced by a task. If the target is being referenced, the system returns an error and does not deregister the target from the maintenance window.
    */
  var Safe: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the maintenance window the target should be removed from.
    */
  var WindowId: MaintenanceWindowId
  /**
    * The ID of the target definition to remove.
    */
  var WindowTargetId: MaintenanceWindowTargetId
}

object DeregisterTargetFromMaintenanceWindowRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    WindowTargetId: MaintenanceWindowTargetId,
    Safe: js.UndefOr[Boolean] = js.undefined
  ): DeregisterTargetFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId, WindowTargetId = WindowTargetId)
    if (!js.isUndefined(Safe)) __obj.updateDynamic("Safe")(Safe)
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
  }
}

