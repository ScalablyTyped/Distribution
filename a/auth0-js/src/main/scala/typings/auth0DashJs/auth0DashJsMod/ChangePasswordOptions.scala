package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordOptions extends js.Object {
  var connection: String
  var email: String
}

object ChangePasswordOptions {
  @scala.inline
  def apply(connection: String, email: String): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangePasswordOptions]
  }
}

