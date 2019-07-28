package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowIdentityForTarget extends js.Object {
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object MaintenanceWindowIdentityForTarget {
  @scala.inline
  def apply(Name: MaintenanceWindowName = null, WindowId: MaintenanceWindowId = null): MaintenanceWindowIdentityForTarget = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[MaintenanceWindowIdentityForTarget]
  }
}

