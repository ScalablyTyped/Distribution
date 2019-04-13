package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var ResourceArn: __string
  /**
    * A collections of tag keys. For example, {"key1","key2"}
    */
  var TagKeys: __listOf__string
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: __listOf__string): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

