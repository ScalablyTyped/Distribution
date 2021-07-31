package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordGrantOptions extends StObject {
  
  var password: String
  
  var realm: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var username: String
}
object PasswordGrantOptions {
  
  @scala.inline
  def apply(password: String, username: String): PasswordGrantOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordGrantOptions]
  }
  
  @scala.inline
  implicit class PasswordGrantOptionsMutableBuilder[Self <: PasswordGrantOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
