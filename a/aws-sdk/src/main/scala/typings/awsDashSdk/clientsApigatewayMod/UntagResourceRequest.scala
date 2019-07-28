package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * [Required] The ARN of a resource that can be tagged. The resource ARN must be URL-encoded.
    */
  var resourceArn: String
  /**
    * [Required] The Tag keys to delete.
    */
  var tagKeys: ListOfString
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tagKeys: ListOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

