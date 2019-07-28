package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the Amazon FSx resource to untag.
    */
  var ResourceARN: typings.awsDashSdk.clientsFsxMod.ResourceARN
  /**
    * A list of keys of tags on the resource to untag. In case the tag key doesn't exist, the call will still succeed to be idempotent.
    */
  var TagKeys: typings.awsDashSdk.clientsFsxMod.TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

