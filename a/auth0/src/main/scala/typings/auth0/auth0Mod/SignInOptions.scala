package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignInOptions extends VerifyOptions {
  var connection: js.UndefOr[String] = js.undefined
}

object SignInOptions {
  @scala.inline
  def apply(password: String, username: String, connection: String = null): SignInOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInOptions]
  }
}

