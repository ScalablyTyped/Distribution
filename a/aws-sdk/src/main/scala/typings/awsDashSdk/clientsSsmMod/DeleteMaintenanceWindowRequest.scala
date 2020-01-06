package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the maintenance window to delete.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object DeleteMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): DeleteMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMaintenanceWindowRequest]
  }
}

