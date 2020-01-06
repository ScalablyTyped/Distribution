package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledWindowExecution extends js.Object {
  /**
    * The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.
    */
  var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window to be run.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The ID of the maintenance window to be run.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}

object ScheduledWindowExecution {
  @scala.inline
  def apply(
    ExecutionTime: MaintenanceWindowStringDateTime = null,
    Name: MaintenanceWindowName = null,
    WindowId: MaintenanceWindowId = null
  ): ScheduledWindowExecution = {
    val __obj = js.Dynamic.literal()
    if (ExecutionTime != null) __obj.updateDynamic("ExecutionTime")(ExecutionTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledWindowExecution]
  }
}

