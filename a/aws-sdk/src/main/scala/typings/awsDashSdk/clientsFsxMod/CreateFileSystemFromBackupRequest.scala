package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileSystemFromBackupRequest extends js.Object {
  var BackupId: typings.awsDashSdk.clientsFsxMod.BackupId
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups apply to all network interfaces. This value isn't returned in later describe requests.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsDashSdk.clientsFsxMod.SecurityGroupIds] = js.undefined
  /**
    * A list of IDs for the subnets that the file system will be accessible from. Currently, you can specify only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  var SubnetIds: typings.awsDashSdk.clientsFsxMod.SubnetIds
  /**
    * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Tags] = js.undefined
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
}

object CreateFileSystemFromBackupRequest {
  @scala.inline
  def apply(
    BackupId: BackupId,
    SubnetIds: SubnetIds,
    ClientRequestToken: ClientRequestToken = null,
    SecurityGroupIds: SecurityGroupIds = null,
    Tags: Tags = null,
    WindowsConfiguration: CreateFileSystemWindowsConfiguration = null
  ): CreateFileSystemFromBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId, SubnetIds = SubnetIds)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration)
    __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
  }
}

