package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemFromBackupResponse extends js.Object {
  /**
    * A description of the file system.
    */
  var FileSystem: js.UndefOr[typings.awsDashSdk.clientsFsxMod.FileSystem] = js.native
}

object CreateFileSystemFromBackupResponse {
  @scala.inline
  def apply(FileSystem: FileSystem = null): CreateFileSystemFromBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystem != null) __obj.updateDynamic("FileSystem")(FileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemFromBackupResponse]
  }
}

