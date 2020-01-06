package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to remove the tags from.
    */
  var ResourceARN: typings.awsDashSdk.clientsStoragegatewayMod.ResourceARN = js.native
  /**
    * The keys of the tags you want to remove from the specified resource. A tag is composed of a key/value pair.
    */
  var TagKeys: typings.awsDashSdk.clientsStoragegatewayMod.TagKeys = js.native
}

object RemoveTagsFromResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): RemoveTagsFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsFromResourceInput]
  }
}

