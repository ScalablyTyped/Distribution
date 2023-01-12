package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuthenticationProfileMessage extends StObject {
  
  /**
    * The name of the authentication profile to delete.
    */
  var AuthenticationProfileName: AuthenticationProfileNameString
}
object DeleteAuthenticationProfileMessage {
  
  inline def apply(AuthenticationProfileName: AuthenticationProfileNameString): DeleteAuthenticationProfileMessage = {
    val __obj = js.Dynamic.literal(AuthenticationProfileName = AuthenticationProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthenticationProfileMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAuthenticationProfileMessage] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
  }
}
