package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typings.awsDashSdk.clientsElbv2Mod.ResourceArns
  /**
    * The tag keys for the tags to remove.
    */
  var TagKeys: typings.awsDashSdk.clientsElbv2Mod.TagKeys
}

object RemoveTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns, TagKeys: TagKeys): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsInput]
  }
}

