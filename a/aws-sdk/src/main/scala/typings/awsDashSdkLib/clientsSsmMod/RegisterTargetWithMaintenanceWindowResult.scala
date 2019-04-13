package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the target definition in this Maintenance Window.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}

object RegisterTargetWithMaintenanceWindowResult {
  @scala.inline
  def apply(WindowTargetId: MaintenanceWindowTargetId = null): RegisterTargetWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId)
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
  }
}

