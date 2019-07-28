package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceRequest extends js.Object {
  /**
    * Identifier (ID) of the directory from which to remove the tag.
    */
  var ResourceId: typings.awsDashSdk.clientsDirectoryserviceMod.ResourceId
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: typings.awsDashSdk.clientsDirectoryserviceMod.TagKeys
}

object RemoveTagsFromResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: TagKeys): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
}

