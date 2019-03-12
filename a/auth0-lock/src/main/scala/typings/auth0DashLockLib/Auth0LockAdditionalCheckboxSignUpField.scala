package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalCheckboxSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var placeholder: java.lang.String
  var prefill: auth0DashLockLib.auth0DashLockLibStrings.`true` | auth0DashLockLib.auth0DashLockLibStrings.`false`
  var `type`: js.UndefOr[auth0DashLockLib.auth0DashLockLibStrings.checkbox] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ java.lang.String, Anon_Hint]] = js.undefined
}

object Auth0LockAdditionalCheckboxSignUpField {
  @scala.inline
  def apply(
    name: java.lang.String,
    placeholder: java.lang.String,
    prefill: auth0DashLockLib.auth0DashLockLibStrings.`true` | auth0DashLockLib.auth0DashLockLibStrings.`false`,
    icon: java.lang.String = null,
    `type`: auth0DashLockLib.auth0DashLockLibStrings.checkbox = null,
    validator: /* input */ java.lang.String => Anon_Hint = null
  ): Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name, placeholder = placeholder, prefill = prefill.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Auth0LockAdditionalCheckboxSignUpField]
  }
}

