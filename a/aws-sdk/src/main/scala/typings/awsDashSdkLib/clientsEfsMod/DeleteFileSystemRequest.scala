package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileSystemRequest extends js.Object {
  /**
    * The ID of the file system you want to delete.
    */
  var FileSystemId: awsDashSdkLib.clientsEfsMod.FileSystemId
}

object DeleteFileSystemRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DeleteFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId)
  
    __obj.asInstanceOf[DeleteFileSystemRequest]
  }
}

