package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var ResourceArn: __string = js.native
  /**
    * A collections of tag keys. For example, {"key1","key2"}
    */
  var TagKeys: __listOf__string = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: __listOf__string): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

