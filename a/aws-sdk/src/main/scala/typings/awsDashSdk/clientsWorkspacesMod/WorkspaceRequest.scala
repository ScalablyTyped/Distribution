package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceRequest extends js.Object {
  /**
    * The identifier of the bundle for the WorkSpace. You can use DescribeWorkspaceBundles to list the available bundles.
    */
  var BundleId: typings.awsDashSdk.clientsWorkspacesMod.BundleId
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace. You can use DescribeWorkspaceDirectories to list the available directories.
    */
  var DirectoryId: typings.awsDashSdk.clientsWorkspacesMod.DirectoryId
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The tags for the WorkSpace.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The username of the user for the WorkSpace. This username must exist in the AWS Directory Service directory for the WorkSpace.
    */
  var UserName: typings.awsDashSdk.clientsWorkspacesMod.UserName
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The KMS key used to encrypt data stored on your WorkSpace.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.VolumeEncryptionKey] = js.undefined
  /**
    * The WorkSpace properties.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceProperties] = js.undefined
}

object WorkspaceRequest {
  @scala.inline
  def apply(
    BundleId: BundleId,
    DirectoryId: DirectoryId,
    UserName: UserName,
    RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
    Tags: TagList = null,
    UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
    VolumeEncryptionKey: VolumeEncryptionKey = null,
    WorkspaceProperties: WorkspaceProperties = null
  ): WorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId, DirectoryId = DirectoryId, UserName = UserName)
    if (!js.isUndefined(RootVolumeEncryptionEnabled)) __obj.updateDynamic("RootVolumeEncryptionEnabled")(RootVolumeEncryptionEnabled)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(UserVolumeEncryptionEnabled)) __obj.updateDynamic("UserVolumeEncryptionEnabled")(UserVolumeEncryptionEnabled)
    if (VolumeEncryptionKey != null) __obj.updateDynamic("VolumeEncryptionKey")(VolumeEncryptionKey)
    if (WorkspaceProperties != null) __obj.updateDynamic("WorkspaceProperties")(WorkspaceProperties)
    __obj.asInstanceOf[WorkspaceRequest]
  }
}

