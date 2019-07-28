package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The keys in the key-value pair in the tag to remove.
    */
  var Keys: TagKeyList
  /**
    * The Amazon Resource Name (ARN) of the resource to remove the tag from.
    */
  var ResourceArn: TaggableResourceArn
}

object UntagResourceRequest {
  @scala.inline
  def apply(Keys: TagKeyList, ResourceArn: TaggableResourceArn): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Keys = Keys, ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

