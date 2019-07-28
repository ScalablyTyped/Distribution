package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToResourceRequest extends js.Object {
  /**
    * Identifier (ID) for the directory to which to add the tag.
    */
  var ResourceId: typings.awsDashSdk.clientsDirectoryserviceMod.ResourceId
  /**
    * The tags to be assigned to the directory.
    */
  var Tags: typings.awsDashSdk.clientsDirectoryserviceMod.Tags
}

object AddTagsToResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, Tags: Tags): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
}

