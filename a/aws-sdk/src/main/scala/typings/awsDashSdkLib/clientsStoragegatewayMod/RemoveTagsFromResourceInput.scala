package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to remove the tags from.
    */
  var ResourceARN: awsDashSdkLib.clientsStoragegatewayMod.ResourceARN
  /**
    * The keys of the tags you want to remove from the specified resource. A tag is composed of a key/value pair.
    */
  var TagKeys: awsDashSdkLib.clientsStoragegatewayMod.TagKeys
}

object RemoveTagsFromResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): RemoveTagsFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromResourceInput]
  }
}

