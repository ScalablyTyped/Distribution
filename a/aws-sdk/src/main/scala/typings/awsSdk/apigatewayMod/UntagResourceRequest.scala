package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * [Required] The ARN of a resource that can be tagged.
    */
  var resourceArn: String = js.native
  /**
    * [Required] The Tag keys to delete.
    */
  var tagKeys: ListOfString = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tagKeys: ListOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

