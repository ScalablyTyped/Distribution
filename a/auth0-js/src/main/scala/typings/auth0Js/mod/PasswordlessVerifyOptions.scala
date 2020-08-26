package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordlessVerifyOptions extends BaseAuthOptions {
  var connection: String = js.native
  var email: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var responseMode: js.UndefOr[String] = js.native
  var send: js.UndefOr[String] = js.native
  var verificationCode: String = js.native
}

object PasswordlessVerifyOptions {
  @scala.inline
  def apply(connection: String, verificationCode: String): PasswordlessVerifyOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessVerifyOptions]
  }
  @scala.inline
  implicit class PasswordlessVerifyOptionsOps[Self <: PasswordlessVerifyOptions] (val x: Self) extends AnyVal {
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerificationCode(value: String): Self = this.set("verificationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    @scala.inline
    def setSend(value: String): Self = this.set("send", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
  }
  
}

