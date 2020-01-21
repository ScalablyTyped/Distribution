package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.`false`
import typings.auth0Lock.auth0LockStrings.`true`
import typings.auth0Lock.auth0LockStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalCheckboxSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[String] = js.undefined
  var name: String
  var placeholder: String
  var prefill: `true` | `false`
  var `type`: js.UndefOr[checkbox] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ String, AnonHint]] = js.undefined
}

object Auth0LockAdditionalCheckboxSignUpField {
  @scala.inline
  def apply(
    name: String,
    placeholder: String,
    prefill: `true` | `false`,
    icon: String = null,
    `type`: checkbox = null,
    validator: /* input */ String => AnonHint = null
  ): Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Auth0LockAdditionalCheckboxSignUpField]
  }
}

