package typings.auth0DashLock

import typings.auth0DashLock.auth0DashLockStrings.`false`
import typings.auth0DashLock.auth0DashLockStrings.`true`
import typings.auth0DashLock.auth0DashLockStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalCheckboxSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[String] = js.undefined
  var name: String
  var placeholder: String
  var prefill: `true` | `false`
  var `type`: js.UndefOr[checkbox] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ String, Anon_Hint]] = js.undefined
}

object Auth0LockAdditionalCheckboxSignUpField {
  @scala.inline
  def apply(
    name: String,
    placeholder: String,
    prefill: `true` | `false`,
    icon: String = null,
    `type`: checkbox = null,
    validator: /* input */ String => Anon_Hint = null
  ): Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name, placeholder = placeholder, prefill = prefill.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Auth0LockAdditionalCheckboxSignUpField]
  }
}

