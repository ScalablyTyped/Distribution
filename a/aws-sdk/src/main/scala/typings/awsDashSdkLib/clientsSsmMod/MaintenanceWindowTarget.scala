package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTarget extends js.Object {
  /**
    * A description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The name for the maintenance window target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The type of target that is being registered with the maintenance window.
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
  /**
    * The targets, either instances or tags. Specify instances using the following format:  Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;  Tags are specified using the following format:  Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The ID of the maintenance window to register the target with.
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

