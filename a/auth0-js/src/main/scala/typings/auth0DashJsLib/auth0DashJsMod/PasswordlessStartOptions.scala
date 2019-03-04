package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessStartOptions extends js.Object {
  var authParams: js.UndefOr[js.Any] = js.undefined
  var connection: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var send: java.lang.String
}

object PasswordlessStartOptions {
  @scala.inline
  def apply(
    connection: java.lang.String,
    send: java.lang.String,
    authParams: js.Any = null,
    email: java.lang.String = null,
    phoneNumber: java.lang.String = null
  ): PasswordlessStartOptions = {
    val __obj = js.Dynamic.literal(connection = connection, send = send)
    if (authParams != null) __obj.updateDynamic("authParams")(authParams)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[PasswordlessStartOptions]
  }
}

