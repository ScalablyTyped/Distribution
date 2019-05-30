package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledWindowExecution extends js.Object {
  /**
    * The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.
    */
  var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The name of the maintenance window to be run.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The ID of the maintenance window to be run.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object ScheduledWindowExecution {
  @scala.inline
  def apply(
    ExecutionTime: MaintenanceWindowStringDateTime = null,
    Name: MaintenanceWindowName = null,
    WindowId: MaintenanceWindowId = null
  ): ScheduledWindowExecution = {
    val __obj = js.Dynamic.literal()
    if (ExecutionTime != null) __obj.updateDynamic("ExecutionTime")(ExecutionTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[ScheduledWindowExecution]
  }
}

