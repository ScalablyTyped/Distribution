package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuthenticationProfileResult extends StObject {
  
  /**
    * The name of the authentication profile that was deleted.
    */
  var AuthenticationProfileName: js.UndefOr[AuthenticationProfileNameString] = js.undefined
}
object DeleteAuthenticationProfileResult {
  
  inline def apply(): DeleteAuthenticationProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAuthenticationProfileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAuthenticationProfileResult] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileNameUndefined: Self = StObject.set(x, "AuthenticationProfileName", js.undefined)
  }
}
