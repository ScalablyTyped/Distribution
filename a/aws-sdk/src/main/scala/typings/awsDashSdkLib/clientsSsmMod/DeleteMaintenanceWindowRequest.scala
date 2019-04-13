package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the Maintenance Window to delete.
    */
  var WindowId: MaintenanceWindowId
}

object DeleteMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): DeleteMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId)
  
    __obj.asInstanceOf[DeleteMaintenanceWindowRequest]
  }
}

