package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessStartOptions extends js.Object {
  var authParams: js.UndefOr[js.Any] = js.undefined
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
    authParams: js.Any = null,
    email: String = null,
    phoneNumber: String = null
  ): PasswordlessStartOptions = {
    val __obj = js.Dynamic.literal(connection = connection, send = send)
    if (authParams != null) __obj.updateDynamic("authParams")(authParams)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[PasswordlessStartOptions]
  }
}

