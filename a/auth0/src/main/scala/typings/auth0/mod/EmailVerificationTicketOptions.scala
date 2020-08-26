package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailVerificationTicketOptions extends js.Object {
  var result_url: String = js.native
  var user_id: String = js.native
}

object EmailVerificationTicketOptions {
  @scala.inline
  def apply(result_url: String, user_id: String): EmailVerificationTicketOptions = {
    val __obj = js.Dynamic.literal(result_url = result_url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailVerificationTicketOptions]
  }
  @scala.inline
  implicit class EmailVerificationTicketOptionsOps[Self <: EmailVerificationTicketOptions] (val x: Self) extends AnyVal {
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
    def setResult_url(value: String): Self = this.set("result_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
  
}

