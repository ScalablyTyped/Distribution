package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordOptions extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object ChangePasswordOptions {
  @scala.inline
  def apply(connection: java.lang.String, email: java.lang.String, password: java.lang.String = null): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("email")(email)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[ChangePasswordOptions]
  }
}

