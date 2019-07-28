package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * ARN of a resource.
    */
  var resourceArn: String
  /**
    * Keys of a resource tag.
    */
  var tagKeys: TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

