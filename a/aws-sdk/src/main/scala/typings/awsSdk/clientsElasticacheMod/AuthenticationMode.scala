package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMode extends StObject {
  
  /**
    * Specifies the passwords to use for authentication if Type is set to password.
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.undefined
  
  /**
    * Specifies the authentication type. Possible options are IAM authentication, password and no password.
    */
  var Type: js.UndefOr[InputAuthenticationType] = js.undefined
}
object AuthenticationMode {
  
  inline def apply(): AuthenticationMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMode] (val x: Self) extends AnyVal {
    
    inline def setPasswords(value: PasswordListInput): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    inline def setPasswordsUndefined: Self = StObject.set(x, "Passwords", js.undefined)
    
    inline def setPasswordsVarargs(value: String*): Self = StObject.set(x, "Passwords", js.Array(value*))
    
    inline def setType(value: InputAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
