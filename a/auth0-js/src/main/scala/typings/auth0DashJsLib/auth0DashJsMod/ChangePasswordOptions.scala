package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordOptions extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
}

object ChangePasswordOptions {
  @scala.inline
  def apply(connection: java.lang.String, email: java.lang.String): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal(connection = connection, email = email)
  
    __obj.asInstanceOf[ChangePasswordOptions]
  }
}

