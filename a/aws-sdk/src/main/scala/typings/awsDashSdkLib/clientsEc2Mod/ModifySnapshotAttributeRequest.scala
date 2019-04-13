package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifySnapshotAttributeRequest extends js.Object {
  /**
    * The snapshot attribute to modify. Only volume creation permissions can be modified.
    */
  var Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined
  /**
    * A JSON representation of the snapshot attribute modification.
    */
  var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The group to modify for the snapshot.
    */
  var GroupNames: js.UndefOr[GroupNameStringList] = js.undefined
  /**
    * The type of operation to perform to the attribute.
    */
  var OperationType: js.UndefOr[OperationType] = js.undefined
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: String
  /**
    * The account ID to modify for the snapshot.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
}

object ModifySnapshotAttributeRequest {
  @scala.inline
  def apply(
    SnapshotId: String,
    Attribute: SnapshotAttributeName = null,
    CreateVolumePermission: CreateVolumePermissionModifications = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    GroupNames: GroupNameStringList = null,
    OperationType: OperationType = null,
    UserIds: UserIdStringList = null
  ): ModifySnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId)
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (CreateVolumePermission != null) __obj.updateDynamic("CreateVolumePermission")(CreateVolumePermission)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (GroupNames != null) __obj.updateDynamic("GroupNames")(GroupNames)
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds)
    __obj.asInstanceOf[ModifySnapshotAttributeRequest]
  }
}

