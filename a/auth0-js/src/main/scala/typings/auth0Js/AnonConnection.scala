package typings.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  /** name of the connection where the user will be created */
  var connection: String
  /** user email address */
  var email: String
  /** user password */
  var password: String
}

object AnonConnection {
  @scala.inline
  def apply(connection: String, email: String, password: String): AnonConnection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnection]
  }
}

