package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.`false`
import typings.auth0Lock.auth0LockStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.auth0Lock.Auth0LockAdditionalSelectSignUpField
  - typings.auth0Lock.Auth0LockAdditionalTextSignUpField
  - typings.auth0Lock.Auth0LockAdditionalCheckboxSignUpField
*/
trait Auth0LockAdditionalSignUpField extends StObject
object Auth0LockAdditionalSignUpField {
  
  inline def Auth0LockAdditionalCheckboxSignUpField(name: String, placeholder: String, prefill: `true` | `false`): typings.auth0Lock.Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.auth0Lock.Auth0LockAdditionalCheckboxSignUpField]
  }
  
  inline def Auth0LockAdditionalSelectSignUpField(name: String, placeholder: String): typings.auth0Lock.Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.auth0Lock.Auth0LockAdditionalSelectSignUpField]
  }
  
  inline def Auth0LockAdditionalTextSignUpField(name: String, placeholder: String): typings.auth0Lock.Auth0LockAdditionalTextSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.auth0Lock.Auth0LockAdditionalTextSignUpField]
  }
}
