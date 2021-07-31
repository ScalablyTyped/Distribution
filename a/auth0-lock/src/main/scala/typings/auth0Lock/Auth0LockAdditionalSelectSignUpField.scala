package typings.auth0Lock

import typings.auth0Lock.anon.Hint
import typings.auth0Lock.auth0LockStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAdditionalSelectSignUpField
  extends StObject
     with Auth0LockAdditionalSignUpField {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.undefined
  
  var placeholder: String
  
  var prefill: js.UndefOr[String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.undefined
  
  var `type`: js.UndefOr[select] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* input */ String, Hint]] = js.undefined
}
object Auth0LockAdditionalSelectSignUpField {
  
  @scala.inline
  def apply(name: String, placeholder: String): Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSelectSignUpField]
  }
  
  @scala.inline
  implicit class Auth0LockAdditionalSelectSignUpFieldMutableBuilder[Self <: Auth0LockAdditionalSelectSignUpField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(
      value: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback => Unit): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Auth0LockAdditionalSignUpFieldOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefill(value: String | Auth0LockAdditionalSignUpFieldPrefillFunction): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefillFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback => Unit): Self = StObject.set(x, "prefill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
    
    @scala.inline
    def setType(value: select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidator(value: /* input */ String => Hint): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
