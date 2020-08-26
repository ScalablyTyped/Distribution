package typings.apiErrorHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Body response: the JSON returned by api-error-handler
// See https://github.com/expressjs/api-error-handler/blob/1.0.0/index.js
@js.native
trait Response extends js.Object {
  // Client errors
  var code: js.UndefOr[js.Any] = js.native
  var message: String = js.native
  var name: js.UndefOr[String] = js.native
  var stack: js.UndefOr[String] = js.native
  var status: Double = js.native
  var `type`: js.UndefOr[js.Any] = js.native
}

object Response {
  @scala.inline
  def apply(message: String, status: Double): Response = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: js.Any): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

