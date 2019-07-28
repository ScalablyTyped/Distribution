package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsDashSdk.clientsOpsworksMod.ResourceArn
  /**
    * A list of the keys of tags to be removed from a stack or layer.
    */
  var TagKeys: typings.awsDashSdk.clientsOpsworksMod.TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

