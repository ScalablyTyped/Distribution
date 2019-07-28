package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileSystemResponse extends js.Object {
  /**
    * The ID of the file system being deleted.
    */
  var FileSystemId: js.UndefOr[typings.awsDashSdk.clientsFsxMod.FileSystemId] = js.undefined
  /**
    * The file system lifecycle for the deletion request. Should be DELETING.
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
  var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined
}

object DeleteFileSystemResponse {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId = null,
    Lifecycle: FileSystemLifecycle = null,
    WindowsResponse: DeleteFileSystemWindowsResponse = null
  ): DeleteFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (WindowsResponse != null) __obj.updateDynamic("WindowsResponse")(WindowsResponse)
    __obj.asInstanceOf[DeleteFileSystemResponse]
  }
}

