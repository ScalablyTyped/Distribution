package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the maintenance window for which you want to retrieve information.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object GetMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): GetMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMaintenanceWindowRequest]
  }
}

