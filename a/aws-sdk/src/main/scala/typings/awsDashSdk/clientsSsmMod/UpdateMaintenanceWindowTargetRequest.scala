package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceWindowTargetRequest extends js.Object {
  /**
    * An optional description for the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * A name for the update.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OwnerInformation] = js.undefined
  /**
    * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.undefined
  /**
    * The targets to add or replace.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
  /**
    * The maintenance window ID with which to modify the target.
    */
  var WindowId: MaintenanceWindowId
  /**
    * The target ID to modify.
    */
  var WindowTargetId: MaintenanceWindowTargetId
}

object UpdateMaintenanceWindowTargetRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    WindowTargetId: MaintenanceWindowTargetId,
    Description: MaintenanceWindowDescription = null,
    Name: MaintenanceWindowName = null,
    OwnerInformation: OwnerInformation = null,
    Replace: js.UndefOr[scala.Boolean] = js.undefined,
    Targets: Targets = null
  ): UpdateMaintenanceWindowTargetRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId, WindowTargetId = WindowTargetId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation)
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
  }
}

