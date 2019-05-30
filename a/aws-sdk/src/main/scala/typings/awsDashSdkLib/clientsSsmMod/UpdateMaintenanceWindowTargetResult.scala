package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceWindowTargetResult extends js.Object {
  /**
    * The updated description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The updated name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The updated owner.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The updated targets.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The maintenance window ID specified in the update request.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The target ID specified in the update request.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}

object UpdateMaintenanceWindowTargetResult {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    Name: MaintenanceWindowName = null,
    OwnerInformation: OwnerInformation = null,
    Targets: Targets = null,
    WindowId: MaintenanceWindowId = null,
    WindowTargetId: MaintenanceWindowTargetId = null
  ): UpdateMaintenanceWindowTargetResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId)
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
  }
}

