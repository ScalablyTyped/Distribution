package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ID of the resource to remove the tag from.
    */
  var ResourceId: TaggableResourceId
  /**
    * The tag to remove from the specified resource.
    */
  var TagKeys: typings.awsDashSdk.clientsOrganizationsMod.TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceId: TaggableResourceId, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

