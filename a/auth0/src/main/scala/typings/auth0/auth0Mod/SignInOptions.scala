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
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[SignInOptions]
  }
}

