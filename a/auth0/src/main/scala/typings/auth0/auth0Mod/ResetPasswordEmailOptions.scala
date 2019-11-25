package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordEmailOptions extends js.Object {
  var connection: String
  var email: String
}

object ResetPasswordEmailOptions {
  @scala.inline
  def apply(connection: String, email: String): ResetPasswordEmailOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResetPasswordEmailOptions]
  }
}

