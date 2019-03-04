package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessAuthOptions extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
  var phoneNumber: java.lang.String
  var verificationCode: java.lang.String
}

object PasswordlessAuthOptions {
  @scala.inline
  def apply(
    connection: java.lang.String,
    email: java.lang.String,
    phoneNumber: java.lang.String,
    verificationCode: java.lang.String
  ): PasswordlessAuthOptions = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, phoneNumber = phoneNumber, verificationCode = verificationCode)
  
    __obj.asInstanceOf[PasswordlessAuthOptions]
  }
}

