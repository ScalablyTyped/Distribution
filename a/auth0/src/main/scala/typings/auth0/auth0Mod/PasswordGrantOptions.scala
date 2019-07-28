package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordGrantOptions extends js.Object {
  var password: String
  var realm: js.UndefOr[String] = js.undefined
  var username: String
}

object PasswordGrantOptions {
  @scala.inline
  def apply(password: String, username: String, realm: String = null): PasswordGrantOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    __obj.asInstanceOf[PasswordGrantOptions]
  }
}

