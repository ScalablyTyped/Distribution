package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFileSystemResponse extends js.Object {
  /**
    * A description of the file system.
    */
  var FileSystem: js.UndefOr[FileSystem] = js.undefined
}

object UpdateFileSystemResponse {
  @scala.inline
  def apply(FileSystem: FileSystem = null): UpdateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystem != null) __obj.updateDynamic("FileSystem")(FileSystem)
    __obj.asInstanceOf[UpdateFileSystemResponse]
  }
}

