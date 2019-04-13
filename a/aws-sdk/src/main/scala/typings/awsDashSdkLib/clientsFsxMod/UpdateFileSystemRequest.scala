package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFileSystemRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  var FileSystemId: awsDashSdkLib.clientsFsxMod.FileSystemId
  var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined
  /**
    * The configuration for this Microsoft Windows file system. The only supported options are for backup and maintenance.
    */
  var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    ClientRequestToken: ClientRequestToken = null,
    LustreConfiguration: UpdateFileSystemLustreConfiguration = null,
    WindowsConfiguration: UpdateFileSystemWindowsConfiguration = null
  ): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration)
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration)
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
}

