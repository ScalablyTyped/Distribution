package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the task in the Maintenance Window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}

object RegisterTaskWithMaintenanceWindowResult {
  @scala.inline
  def apply(WindowTaskId: MaintenanceWindowTaskId = null): RegisterTaskWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId)
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
  }
}

