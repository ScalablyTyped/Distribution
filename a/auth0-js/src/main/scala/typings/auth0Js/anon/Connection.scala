package typings.auth0Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /** name of the connection where the user will be created */
  var connection: String
  /** user email address */
  var email: String
  /** user password */
  var password: String
}

object Connection {
  @scala.inline
  def apply(connection: String, email: String, password: String): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

