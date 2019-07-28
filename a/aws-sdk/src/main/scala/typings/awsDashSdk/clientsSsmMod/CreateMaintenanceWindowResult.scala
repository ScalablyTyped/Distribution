package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the created maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object CreateMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null): CreateMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[CreateMaintenanceWindowResult]
  }
}

