package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.ClientRequestToken] = js.native
  var FileSystemId: typings.awsDashSdk.clientsFsxMod.FileSystemId = js.native
  var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.native
  /**
    * The configuration update for this Microsoft Windows file system. The only supported options are for backup and maintenance and for self-managed Active Directory configuration.
    */
  var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.native
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    ClientRequestToken: ClientRequestToken = null,
    LustreConfiguration: UpdateFileSystemLustreConfiguration = null,
    WindowsConfiguration: UpdateFileSystemWindowsConfiguration = null
  ): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
}

