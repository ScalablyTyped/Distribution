package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelMaintenanceWindowExecutionRequest extends js.Object {
  /**
    * The ID of the Maintenance Window execution to stop.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}

object CancelMaintenanceWindowExecutionRequest {
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): CancelMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId)
  
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionRequest]
  }
}

