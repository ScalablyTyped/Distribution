package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTargetWithMaintenanceWindowRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[ClientToken] = js.undefined
  /**
    * An optional description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * An optional name for the target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The type of target being registered with the maintenance window.
    */
  var ResourceType: MaintenanceWindowResourceType
  /**
    * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using either instance IDs or tags that have been applied to instances.  Example 1: Specify instance IDs  Key=InstanceIds,Values=instance-id-1,instance-id-2,instance-id-3    Example 2: Use tag key-pairs applied to instances  Key=tag:my-tag-key,Values=my-tag-value-1,my-tag-value-2    Example 3: Use tag-keys applied to instances  Key=tag-key,Values=my-tag-key-1,my-tag-key-2   For more information about these examples formats, including the best use case for each one, see Examples: Register Targets with a Maintenance Window in the AWS Systems Manager User Guide.
    */
  var Targets: awsDashSdkLib.clientsSsmMod.Targets
  /**
    * The ID of the maintenance window the target should be registered with.
    */
  var WindowId: MaintenanceWindowId
}

object RegisterTargetWithMaintenanceWindowRequest {
  @scala.inline
  def apply(
    ResourceType: MaintenanceWindowResourceType,
    Targets: Targets,
    WindowId: MaintenanceWindowId,
    ClientToken: ClientToken = null,
    Description: MaintenanceWindowDescription = null,
    Name: MaintenanceWindowName = null,
    OwnerInformation: OwnerInformation = null
  ): RegisterTargetWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets, WindowId = WindowId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation)
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
  }
}

