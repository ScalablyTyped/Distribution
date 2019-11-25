package typings.auth0DashJs

import typings.auth0DashJs.auth0DashJsStrings.email
import typings.auth0DashJs.auth0DashJsStrings.sms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionEmail extends js.Object {
  /** the connection name */
  var connection: String
  /** only if type = email */
  var email: js.UndefOr[String] = js.undefined
  /**  only if type = sms */
  var phoneNumber: js.UndefOr[String] = js.undefined
  var `type`: sms | email
  /** the TOTP code */
  var verificationCode: String
}

object Anon_ConnectionEmail {
  @scala.inline
  def apply(
    connection: String,
    `type`: sms | email,
    verificationCode: String,
    email: String = null,
    phoneNumber: String = null
  ): Anon_ConnectionEmail = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConnectionEmail]
  }
}

