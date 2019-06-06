package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which to remove the tags.
    */
  var ResourceArn: GlueResourceArn
  /**
    * Tags to remove from this resource.
    */
  var TagsToRemove: TagKeysList
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToRemove: TagKeysList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagsToRemove = TagsToRemove)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

