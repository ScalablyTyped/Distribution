package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.hidden
import typings.auth0Lock.auth0LockStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAdditionalHiddenSignUpField
  extends StObject
     with Auth0LockAdditionalSignUpField {
  
  var name: String
  
  var storage: js.UndefOr[root] = js.undefined
  
  var `type`: js.UndefOr[hidden] = js.undefined
  
  var value: String
}
object Auth0LockAdditionalHiddenSignUpField {
  
  inline def apply(name: String, value: String): Auth0LockAdditionalHiddenSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalHiddenSignUpField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auth0LockAdditionalHiddenSignUpField] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: root): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setType(value: hidden): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
