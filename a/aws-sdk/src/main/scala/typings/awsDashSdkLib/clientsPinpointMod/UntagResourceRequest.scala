package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  var ResourceArn: __string
  /**
    * The key(s) of tag to be deleted
    */
  var TagKeys: ListOf__string
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: ListOf__string): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

