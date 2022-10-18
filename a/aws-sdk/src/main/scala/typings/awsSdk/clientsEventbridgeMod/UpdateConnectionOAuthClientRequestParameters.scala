package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionOAuthClientRequestParameters extends StObject {
  
  /**
    * The client ID to use for OAuth authorization.
    */
  var ClientID: js.UndefOr[AuthHeaderParameters] = js.undefined
  
  /**
    * The client secret assciated with the client ID to use for OAuth authorization.
    */
  var ClientSecret: js.UndefOr[AuthHeaderParameters] = js.undefined
}
object UpdateConnectionOAuthClientRequestParameters {
  
  inline def apply(): UpdateConnectionOAuthClientRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectionOAuthClientRequestParameters]
  }
  
  extension [Self <: UpdateConnectionOAuthClientRequestParameters](x: Self) {
    
    inline def setClientID(value: AuthHeaderParameters): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "ClientID", js.undefined)
    
    inline def setClientSecret(value: AuthHeaderParameters): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
  }
}
