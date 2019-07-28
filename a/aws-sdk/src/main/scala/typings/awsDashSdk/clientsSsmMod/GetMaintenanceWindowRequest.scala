package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the maintenance window for which you want to retrieve information.
    */
  var WindowId: MaintenanceWindowId
}

object GetMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): GetMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId)
  
    __obj.asInstanceOf[GetMaintenanceWindowRequest]
  }
}

