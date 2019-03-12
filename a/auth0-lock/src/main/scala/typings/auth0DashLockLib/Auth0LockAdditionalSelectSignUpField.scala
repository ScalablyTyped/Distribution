package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalSelectSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.undefined
  var placeholder: java.lang.String
  var prefill: js.UndefOr[java.lang.String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.undefined
  var `type`: js.UndefOr[auth0DashLockLib.auth0DashLockLibStrings.select] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ java.lang.String, Anon_Hint]] = js.undefined
}

object Auth0LockAdditionalSelectSignUpField {
  @scala.inline
  def apply(
    name: java.lang.String,
    placeholder: java.lang.String,
    icon: java.lang.String = null,
    options: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction = null,
    prefill: java.lang.String | Auth0LockAdditionalSignUpFieldPrefillFunction = null,
    `type`: auth0DashLockLib.auth0DashLockLibStrings.select = null,
    validator: /* input */ java.lang.String => Anon_Hint = null
  ): Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name, placeholder = placeholder)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefill != null) __obj.updateDynamic("prefill")(prefill.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Auth0LockAdditionalSelectSignUpField]
  }
}

