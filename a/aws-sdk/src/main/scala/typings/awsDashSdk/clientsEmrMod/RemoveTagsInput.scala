package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsInput extends js.Object {
  /**
    * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
    */
  var ResourceId: typings.awsDashSdk.clientsEmrMod.ResourceId
  /**
    * A list of tag keys to remove from a resource.
    */
  var TagKeys: StringList
}

object RemoveTagsInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: StringList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsInput]
  }
}

