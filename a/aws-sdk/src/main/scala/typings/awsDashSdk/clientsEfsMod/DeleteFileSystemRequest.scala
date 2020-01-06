package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemRequest extends js.Object {
  /**
    * The ID of the file system you want to delete.
    */
  var FileSystemId: typings.awsDashSdk.clientsEfsMod.FileSystemId = js.native
}

object DeleteFileSystemRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DeleteFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFileSystemRequest]
  }
}

