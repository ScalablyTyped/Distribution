package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionEmail extends js.Object {
  /** the connection name */
  var connection: java.lang.String
  /** only if type = email */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**  only if type = sms */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var `type`: auth0DashJsLib.auth0DashJsLibStrings.sms | auth0DashJsLib.auth0DashJsLibStrings.email
  /** the TOTP code */
  var verificationCode: java.lang.String
}

object Anon_ConnectionEmail {
  @scala.inline
  def apply(
    connection: java.lang.String,
    `type`: auth0DashJsLib.auth0DashJsLibStrings.sms | auth0DashJsLib.auth0DashJsLibStrings.email,
    verificationCode: java.lang.String,
    email: java.lang.String = null,
    phoneNumber: java.lang.String = null
  ): Anon_ConnectionEmail = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("verificationCode")(verificationCode)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[Anon_ConnectionEmail]
  }
}

