package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileSystemResponse extends js.Object {
  /**
    * A description of the file system.
    */
  var FileSystem: js.UndefOr[FileSystem] = js.undefined
}

object CreateFileSystemResponse {
  @scala.inline
  def apply(FileSystem: FileSystem = null): CreateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystem != null) __obj.updateDynamic("FileSystem")(FileSystem)
    __obj.asInstanceOf[CreateFileSystemResponse]
  }
}

