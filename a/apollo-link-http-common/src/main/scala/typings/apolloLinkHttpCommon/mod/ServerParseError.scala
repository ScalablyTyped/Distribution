package typings.apolloLinkHttpCommon.mod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  response :std.Response,   statusCode :number,   bodyText :string} */
@js.native
trait ServerParseError extends js.Object {
  var bodyText: String = js.native
  var message: String = js.native
  var name: String = js.native
  var response: Response = js.native
  var stack: js.UndefOr[String] = js.native
  var statusCode: Double = js.native
}

object ServerParseError {
  @scala.inline
  def apply(bodyText: String, message: String, name: String, response: Response, statusCode: Double): ServerParseError = {
    val __obj = js.Dynamic.literal(bodyText = bodyText.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerParseError]
  }
  @scala.inline
  implicit class ServerParseErrorOps[Self <: ServerParseError] (val x: Self) extends AnyVal {
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
    def setBodyText(value: String): Self = this.set("bodyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

