package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessVerifyOptions extends js.Object {
  var connection: String
  var email: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var send: js.UndefOr[String] = js.undefined
  var verificationCode: String
}

object PasswordlessVerifyOptions {
  @scala.inline
  def apply(
    connection: String,
    verificationCode: String,
    email: String = null,
    phoneNumber: String = null,
    send: String = null
  ): PasswordlessVerifyOptions = {
    val __obj = js.Dynamic.literal(connection = connection, verificationCode = verificationCode)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (send != null) __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[PasswordlessVerifyOptions]
  }
}

