package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.CustomPayload
import typings.awsLambda.awsLambdaStrings.PlainText_
import typings.awsLambda.awsLambdaStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var content: String = js.native
  var contentType: PlainText_ | SSML | CustomPayload = js.native
}

object Content {
  @scala.inline
  def apply(content: String, contentType: PlainText_ | SSML | CustomPayload): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: PlainText_ | SSML | CustomPayload): Self = this.set("contentType", value.asInstanceOf[js.Any])
  }
  
}

