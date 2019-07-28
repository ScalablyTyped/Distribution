package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessAuthOptions extends js.Object {
  var connection: String
  var email: String
  var phoneNumber: String
  var verificationCode: String
}

object PasswordlessAuthOptions {
  @scala.inline
  def apply(connection: String, email: String, phoneNumber: String, verificationCode: String): PasswordlessAuthOptions = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, phoneNumber = phoneNumber, verificationCode = verificationCode)
  
    __obj.asInstanceOf[PasswordlessAuthOptions]
  }
}

