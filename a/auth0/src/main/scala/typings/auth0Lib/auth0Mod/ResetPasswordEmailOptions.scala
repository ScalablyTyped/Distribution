package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordEmailOptions extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
}

object ResetPasswordEmailOptions {
  @scala.inline
  def apply(connection: java.lang.String, email: java.lang.String): ResetPasswordEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[ResetPasswordEmailOptions]
  }
}

