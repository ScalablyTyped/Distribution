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
  @scala.inline
  implicit class UntagResourceRequestOps[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceArn(value: String): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = this.set("tagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: ListOfString): Self = this.set("tagKeys", value.asInstanceOf[js.Any])
  }
  
}

