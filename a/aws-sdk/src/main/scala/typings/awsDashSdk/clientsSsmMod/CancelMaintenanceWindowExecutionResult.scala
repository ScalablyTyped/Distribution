package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMaintenanceWindowExecutionResult extends js.Object {
  /**
    * The ID of the maintenance window execution that has been stopped.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}

object CancelMaintenanceWindowExecutionResult {
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId = null): CancelMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionResult]
  }
}

