package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the task in the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object RegisterTaskWithMaintenanceWindowResult {
  @scala.inline
  def apply(WindowTaskId: MaintenanceWindowTaskId = null): RegisterTaskWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
  }
}

