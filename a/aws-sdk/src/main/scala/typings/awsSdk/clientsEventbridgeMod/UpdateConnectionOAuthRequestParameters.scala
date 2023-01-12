package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionOAuthRequestParameters extends StObject {
  
  /**
    * The URL to the authorization endpoint when OAuth is specified as the authorization type.
    */
  var AuthorizationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined
  
  /**
    * A UpdateConnectionOAuthClientRequestParameters object that contains the client parameters to use for the connection when OAuth is specified as the authorization type.
    */
  var ClientParameters: js.UndefOr[UpdateConnectionOAuthClientRequestParameters] = js.undefined
  
  /**
    * The method used to connect to the HTTP endpoint.
    */
  var HttpMethod: js.UndefOr[ConnectionOAuthHttpMethod] = js.undefined
  
  /**
    * The additional HTTP parameters used for the OAuth authorization request.
    */
  var OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
}
object UpdateConnectionOAuthRequestParameters {
  
  inline def apply(): UpdateConnectionOAuthRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectionOAuthRequestParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectionOAuthRequestParameters] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationEndpoint(value: HttpsEndpoint): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEndpointUndefined: Self = StObject.set(x, "AuthorizationEndpoint", js.undefined)
    
    inline def setClientParameters(value: UpdateConnectionOAuthClientRequestParameters): Self = StObject.set(x, "ClientParameters", value.asInstanceOf[js.Any])
    
    inline def setClientParametersUndefined: Self = StObject.set(x, "ClientParameters", js.undefined)
    
    inline def setHttpMethod(value: ConnectionOAuthHttpMethod): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
    
    inline def setOAuthHttpParameters(value: ConnectionHttpParameters): Self = StObject.set(x, "OAuthHttpParameters", value.asInstanceOf[js.Any])
    
    inline def setOAuthHttpParametersUndefined: Self = StObject.set(x, "OAuthHttpParameters", js.undefined)
  }
}
