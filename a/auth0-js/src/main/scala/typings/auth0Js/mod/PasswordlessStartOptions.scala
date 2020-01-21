package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessStartOptions extends js.Object {
  var authParams: js.UndefOr[PasswordlessStartAuthParams] = js.undefined
  var connection: String
  var email: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var send: String
}

object PasswordlessStartOptions {
  @scala.inline
  def apply(
    connection: String,
    send: String,
    authParams: PasswordlessStartAuthParams = null,
    email: String = null,
    phoneNumber: String = null
  ): PasswordlessStartOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    if (authParams != null) __obj.updateDynamic("authParams")(authParams.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessStartOptions]
  }
}

