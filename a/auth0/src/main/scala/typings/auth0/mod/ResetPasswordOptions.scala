package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordOptions extends js.Object {
  var connection: String
  var email: String
  var password: String
}

object ResetPasswordOptions {
  @scala.inline
  def apply(connection: String, email: String, password: String): ResetPasswordOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordOptions]
  }
}

