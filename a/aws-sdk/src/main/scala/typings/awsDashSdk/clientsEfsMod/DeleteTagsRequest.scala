package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tags you want to delete (String).
    */
  var FileSystemId: typings.awsDashSdk.clientsEfsMod.FileSystemId
  /**
    * A list of tag keys to delete.
    */
  var TagKeys: typings.awsDashSdk.clientsEfsMod.TagKeys
}

object DeleteTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, TagKeys: TagKeys): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId, TagKeys = TagKeys)
  
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

