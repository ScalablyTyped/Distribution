package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceRequest extends js.Object {
  /**
    * The identifier of the bundle for the WorkSpace. You can use DescribeWorkspaceBundles to list the available bundles.
    */
  var BundleId: typings.awsDashSdk.clientsWorkspacesMod.BundleId = js.native
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace. You can use DescribeWorkspaceDirectories to list the available directories.
    */
  var DirectoryId: typings.awsDashSdk.clientsWorkspacesMod.DirectoryId = js.native
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The tags for the WorkSpace.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the AWS Directory Service directory for the WorkSpace.
    */
  var UserName: typings.awsDashSdk.clientsWorkspacesMod.UserName = js.native
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The KMS key used to encrypt data stored on your WorkSpace.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.VolumeEncryptionKey] = js.native
  /**
    * The WorkSpace properties.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceProperties] = js.native
}

object WorkspaceRequest {
  @scala.inline
  def apply(
    BundleId: BundleId,
    DirectoryId: DirectoryId,
    UserName: UserName,
    RootVolumeEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
    Tags: TagList = null,
    UserVolumeEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
    VolumeEncryptionKey: VolumeEncryptionKey = null,
    WorkspaceProperties: WorkspaceProperties = null
  ): WorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (!js.isUndefined(RootVolumeEncryptionEnabled)) __obj.updateDynamic("RootVolumeEncryptionEnabled")(RootVolumeEncryptionEnabled.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(UserVolumeEncryptionEnabled)) __obj.updateDynamic("UserVolumeEncryptionEnabled")(UserVolumeEncryptionEnabled.asInstanceOf[js.Any])
    if (VolumeEncryptionKey != null) __obj.updateDynamic("VolumeEncryptionKey")(VolumeEncryptionKey.asInstanceOf[js.Any])
    if (WorkspaceProperties != null) __obj.updateDynamic("WorkspaceProperties")(WorkspaceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceRequest]
  }
}

