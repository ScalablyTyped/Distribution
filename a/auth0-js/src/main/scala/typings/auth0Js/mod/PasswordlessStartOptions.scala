package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordlessStartOptions extends js.Object {
  var authParams: js.UndefOr[PasswordlessStartAuthParams] = js.native
  var connection: String = js.native
  var email: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var send: String = js.native
}

object PasswordlessStartOptions {
  @scala.inline
  def apply(connection: String, send: String): PasswordlessStartOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessStartOptions]
  }
  @scala.inline
  implicit class PasswordlessStartOptionsOps[Self <: PasswordlessStartOptions] (val x: Self) extends AnyVal {
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
    def setSend(value: String): Self = this.set("send", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthParams(value: PasswordlessStartAuthParams): Self = this.set("authParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthParams: Self = this.set("authParams", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
  
}

