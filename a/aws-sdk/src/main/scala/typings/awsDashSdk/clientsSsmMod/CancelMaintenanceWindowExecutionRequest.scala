package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMaintenanceWindowExecutionRequest extends js.Object {
  /**
    * The ID of the maintenance window execution to stop.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}

object CancelMaintenanceWindowExecutionRequest {
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): CancelMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionRequest]
  }
}

