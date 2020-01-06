package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the deleted maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}

object DeleteMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null): DeleteMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMaintenanceWindowResult]
  }
}

