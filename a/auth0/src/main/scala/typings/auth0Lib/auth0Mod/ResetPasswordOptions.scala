package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordOptions extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
  var password: java.lang.String
}

object ResetPasswordOptions {
  @scala.inline
  def apply(connection: java.lang.String, email: java.lang.String, password: java.lang.String): ResetPasswordOptions = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, password = password)
  
    __obj.asInstanceOf[ResetPasswordOptions]
  }
}

