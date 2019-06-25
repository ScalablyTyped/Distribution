package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileSystemResponse extends js.Object {
  /**
    * The configuration of the file system that was created.
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

