package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAdditionalSignUpFieldOption extends StObject {
  
  var label: String
  
  var value: String
}
object Auth0LockAdditionalSignUpFieldOption {
  
  @scala.inline
  def apply(label: String, value: String): Auth0LockAdditionalSignUpFieldOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSignUpFieldOption]
  }
  
  @scala.inline
  implicit class Auth0LockAdditionalSignUpFieldOptionMutableBuilder[Self <: Auth0LockAdditionalSignUpFieldOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
