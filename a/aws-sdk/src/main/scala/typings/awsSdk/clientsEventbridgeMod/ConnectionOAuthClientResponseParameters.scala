package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOAuthClientResponseParameters extends StObject {
  
  /**
    * The client ID associated with the response to the connection request.
    */
  var ClientID: js.UndefOr[AuthHeaderParameters] = js.undefined
}
object ConnectionOAuthClientResponseParameters {
  
  inline def apply(): ConnectionOAuthClientResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOAuthClientResponseParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionOAuthClientResponseParameters] (val x: Self) extends AnyVal {
    
    inline def setClientID(value: AuthHeaderParameters): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "ClientID", js.undefined)
  }
}
