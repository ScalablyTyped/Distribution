package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTarget extends js.Object {
  /**
    * A description of the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The target name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The type of target.
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The Maintenance Window ID where the target is registered.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The ID of the target.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}

object MaintenanceWindowTarget {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    Name: MaintenanceWindowName = null,
    OwnerInformation: OwnerInformation = null,
    ResourceType: MaintenanceWindowResourceType = null,
    Targets: Targets = null,
    WindowId: MaintenanceWindowId = null,
    WindowTargetId: MaintenanceWindowTargetId = null
  ): MaintenanceWindowTarget = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId)
    __obj.asInstanceOf[MaintenanceWindowTarget]
  }
}

