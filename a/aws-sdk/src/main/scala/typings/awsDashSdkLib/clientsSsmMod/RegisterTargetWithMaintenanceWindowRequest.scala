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
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The type of target being registered with the Maintenance Window.
    */
  var ResourceType: MaintenanceWindowResourceType
  /**
    * The targets (either instances or tags).  Specify instances using the following format:  Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify tags using either of the following formats:  Key=tag:&lt;tag-key&gt;,Values=&lt;tag-value-1&gt;,&lt;tag-value-2&gt;   Key=tag-key,Values=&lt;tag-key-1&gt;,&lt;tag-key-2&gt; 
    */
  var Targets: awsDashSdkLib.clientsSsmMod.Targets
  /**
    * The ID of the Maintenance Window the target should be registered with.
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

