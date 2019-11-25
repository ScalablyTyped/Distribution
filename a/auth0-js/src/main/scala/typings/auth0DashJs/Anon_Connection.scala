package typings.auth0DashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  /** name of the connection where the user will be created */
  var connection: String
  /** user email address */
  var email: String
  /** user password */
  var password: String
}

object Anon_Connection {
  @scala.inline
  def apply(connection: String, email: String, password: String): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

