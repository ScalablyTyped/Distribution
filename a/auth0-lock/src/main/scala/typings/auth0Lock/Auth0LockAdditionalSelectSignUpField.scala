package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalSelectSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[String] = js.undefined
  var name: String
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.undefined
  var placeholder: String
  var prefill: js.UndefOr[String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.undefined
  var `type`: js.UndefOr[select] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ String, AnonHint]] = js.undefined
}

object Auth0LockAdditionalSelectSignUpField {
  @scala.inline
  def apply(
    name: String,
    placeholder: String,
    icon: String = null,
    options: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction = null,
    prefill: String | Auth0LockAdditionalSignUpFieldPrefillFunction = null,
    `type`: select = null,
    validator: /* input */ String => AnonHint = null
  ): Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefill != null) __obj.updateDynamic("prefill")(prefill.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Auth0LockAdditionalSelectSignUpField]
  }
}

