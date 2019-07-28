package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPendingMaintenanceActionResult extends js.Object {
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsDashSdk.clientsRdsMod.ResourcePendingMaintenanceActions] = js.undefined
}

object ApplyPendingMaintenanceActionResult {
  @scala.inline
  def apply(ResourcePendingMaintenanceActions: ResourcePendingMaintenanceActions = null): ApplyPendingMaintenanceActionResult = {
    val __obj = js.Dynamic.literal()
    if (ResourcePendingMaintenanceActions != null) __obj.updateDynamic("ResourcePendingMaintenanceActions")(ResourcePendingMaintenanceActions)
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
  }
}

