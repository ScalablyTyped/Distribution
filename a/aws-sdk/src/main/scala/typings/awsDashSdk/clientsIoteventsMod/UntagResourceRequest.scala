package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var resourceArn: AmazonResourceName
  /**
    * A list of the keys of the tags to be removed from the resource.
    */
  var tagKeys: TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: AmazonResourceName, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

