package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoutOptions extends StObject {
  
  var clientID: js.UndefOr[String] = js.undefined
  
  var federated: js.UndefOr[Boolean] = js.undefined
  
  var returnTo: js.UndefOr[String] = js.undefined
}
object LogoutOptions {
  
  inline def apply(): LogoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogoutOptions]
  }
  
  extension [Self <: LogoutOptions](x: Self) {
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    inline def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    inline def setFederatedUndefined: Self = StObject.set(x, "federated", js.undefined)
    
    inline def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
    
    inline def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
  }
}
