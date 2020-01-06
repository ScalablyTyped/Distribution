package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the Amazon FSx resource to untag.
    */
  var ResourceARN: typings.awsDashSdk.clientsFsxMod.ResourceARN = js.native
  /**
    * A list of keys of tags on the resource to untag. In case the tag key doesn't exist, the call will still succeed to be idempotent.
    */
  var TagKeys: typings.awsDashSdk.clientsFsxMod.TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

