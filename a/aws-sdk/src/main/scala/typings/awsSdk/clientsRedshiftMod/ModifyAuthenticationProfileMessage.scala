package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAuthenticationProfileMessage extends StObject {
  
  /**
    * The new content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
    */
  var AuthenticationProfileContent: String
  
  /**
    * The name of the authentication profile to replace.
    */
  var AuthenticationProfileName: AuthenticationProfileNameString
}
object ModifyAuthenticationProfileMessage {
  
  inline def apply(AuthenticationProfileContent: String, AuthenticationProfileName: AuthenticationProfileNameString): ModifyAuthenticationProfileMessage = {
    val __obj = js.Dynamic.literal(AuthenticationProfileContent = AuthenticationProfileContent.asInstanceOf[js.Any], AuthenticationProfileName = AuthenticationProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAuthenticationProfileMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyAuthenticationProfileMessage] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationProfileContent(value: String): Self = StObject.set(x, "AuthenticationProfileContent", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
  }
}
