package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionOAuthClientRequestParameters extends StObject {
  
  /**
    * The client ID to use for OAuth authorization for the connection.
    */
  var ClientID: AuthHeaderParameters
  
  /**
    * The client secret associated with the client ID to use for OAuth authorization for the connection.
    */
  var ClientSecret: AuthHeaderParameters
}
object CreateConnectionOAuthClientRequestParameters {
  
  inline def apply(ClientID: AuthHeaderParameters, ClientSecret: AuthHeaderParameters): CreateConnectionOAuthClientRequestParameters = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionOAuthClientRequestParameters]
  }
  
  extension [Self <: CreateConnectionOAuthClientRequestParameters](x: Self) {
    
    inline def setClientID(value: AuthHeaderParameters): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: AuthHeaderParameters): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
  }
}
