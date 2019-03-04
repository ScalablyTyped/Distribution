package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  /** name of the connection where the user will be created */
  var connection: java.lang.String
  /** user email address */
  var email: java.lang.String
  /** user password */
  var password: java.lang.String
}

object Anon_Connection {
  @scala.inline
  def apply(connection: java.lang.String, email: java.lang.String, password: java.lang.String): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, password = password)
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

