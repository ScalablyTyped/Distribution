package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.`false`
import typings.auth0Lock.auth0LockStrings.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0Lock.Auth0LockAdditionalSelectSignUpField
  - typings.auth0Lock.Auth0LockAdditionalTextSignUpField
  - typings.auth0Lock.Auth0LockAdditionalCheckboxSignUpField
*/
trait Auth0LockAdditionalSignUpField extends js.Object

object Auth0LockAdditionalSignUpField {
  @scala.inline
  def Auth0LockAdditionalSelectSignUpField(name: String, placeholder: String): Auth0LockAdditionalSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSignUpField]
  }
  @scala.inline
  def Auth0LockAdditionalTextSignUpField(name: String, placeholder: String): Auth0LockAdditionalSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSignUpField]
  }
  @scala.inline
  def Auth0LockAdditionalCheckboxSignUpField(name: String, placeholder: String, prefill: `true` | `false`): Auth0LockAdditionalSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSignUpField]
  }
}

