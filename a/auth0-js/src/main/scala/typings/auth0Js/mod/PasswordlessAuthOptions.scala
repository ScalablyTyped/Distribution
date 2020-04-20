package typings.auth0Js.mod

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
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessAuthOptions]
  }
}

