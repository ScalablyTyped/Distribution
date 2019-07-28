package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tags you want to modify (String). This operation modifies the tags only, not the file system.
    */
  var FileSystemId: typings.awsDashSdk.clientsEfsMod.FileSystemId
  /**
    * An array of Tag objects to add. Each Tag object is a key-value pair. 
    */
  var Tags: typings.awsDashSdk.clientsEfsMod.Tags
}

object CreateTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, Tags: Tags): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId, Tags = Tags)
  
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

