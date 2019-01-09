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

