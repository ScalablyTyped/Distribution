package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySnapshotAttributeRequest extends js.Object {
  /**
    * The snapshot attribute to modify. Only volume creation permissions can be modified.
    */
  var Attribute: js.UndefOr[SnapshotAttributeName] = js.native
  /**
    * A JSON representation of the snapshot attribute modification.
    */
  var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The group to modify for the snapshot.
    */
  var GroupNames: js.UndefOr[GroupNameStringList] = js.native
  /**
    * The type of operation to perform to the attribute.
    */
  var OperationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.OperationType] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typings.awsDashSdk.clientsEc2Mod.SnapshotId = js.native
  /**
    * The account ID to modify for the snapshot.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
}

object ModifySnapshotAttributeRequest {
  @scala.inline
  def apply(
    SnapshotId: SnapshotId,
    Attribute: SnapshotAttributeName = null,
    CreateVolumePermission: CreateVolumePermissionModifications = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    GroupNames: GroupNameStringList = null,
    OperationType: OperationType = null,
    UserIds: UserIdStringList = null
  ): ModifySnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (CreateVolumePermission != null) __obj.updateDynamic("CreateVolumePermission")(CreateVolumePermission.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (GroupNames != null) __obj.updateDynamic("GroupNames")(GroupNames.asInstanceOf[js.Any])
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotAttributeRequest]
  }
}

