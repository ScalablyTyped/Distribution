package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the deleted Maintenance Window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object DeleteMaintenanceWindowResult {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId = null): DeleteMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[DeleteMaintenanceWindowResult]
  }
}

