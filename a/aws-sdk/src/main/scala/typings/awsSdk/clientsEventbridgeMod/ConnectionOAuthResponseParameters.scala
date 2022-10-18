package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOAuthResponseParameters extends StObject {
  
  /**
    * The URL to the HTTP endpoint that authorized the request.
    */
  var AuthorizationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined
  
  /**
    * A ConnectionOAuthClientResponseParameters object that contains details about the client parameters returned when OAuth is specified as the authorization type.
    */
  var ClientParameters: js.UndefOr[ConnectionOAuthClientResponseParameters] = js.undefined
  
  /**
    * The method used to connect to the HTTP endpoint.
    */
  var HttpMethod: js.UndefOr[ConnectionOAuthHttpMethod] = js.undefined
  
  /**
    * The additional HTTP parameters used for the OAuth authorization request.
    */
  var OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
}
object ConnectionOAuthResponseParameters {
  
  inline def apply(): ConnectionOAuthResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOAuthResponseParameters]
  }
  
  extension [Self <: ConnectionOAuthResponseParameters](x: Self) {
    
    inline def setAuthorizationEndpoint(value: HttpsEndpoint): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEndpointUndefined: Self = StObject.set(x, "AuthorizationEndpoint", js.undefined)
    
    inline def setClientParameters(value: ConnectionOAuthClientResponseParameters): Self = StObject.set(x, "ClientParameters", value.asInstanceOf[js.Any])
    
    inline def setClientParametersUndefined: Self = StObject.set(x, "ClientParameters", js.undefined)
    
    inline def setHttpMethod(value: ConnectionOAuthHttpMethod): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
    
    inline def setOAuthHttpParameters(value: ConnectionHttpParameters): Self = StObject.set(x, "OAuthHttpParameters", value.asInstanceOf[js.Any])
    
    inline def setOAuthHttpParametersUndefined: Self = StObject.set(x, "OAuthHttpParameters", js.undefined)
  }
}
