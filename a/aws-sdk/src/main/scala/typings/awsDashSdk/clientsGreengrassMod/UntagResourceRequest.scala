package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: __string
  /**
    * An array of tag keys to delete
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

