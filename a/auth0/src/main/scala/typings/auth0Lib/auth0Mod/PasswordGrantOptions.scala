package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordGrantOptions extends js.Object {
  var password: java.lang.String
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object PasswordGrantOptions {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String, realm: java.lang.String = null): PasswordGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    __obj.asInstanceOf[PasswordGrantOptions]
  }
}

