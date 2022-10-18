package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionOAuthRequestParameters extends StObject {
  
  /**
    * The URL to the authorization endpoint when OAuth is specified as the authorization type.
    */
  var AuthorizationEndpoint: HttpsEndpoint
  
  /**
    * A CreateConnectionOAuthClientRequestParameters object that contains the client parameters for OAuth authorization.
    */
  var ClientParameters: CreateConnectionOAuthClientRequestParameters
  
  /**
    * The method to use for the authorization request.
    */
  var HttpMethod: ConnectionOAuthHttpMethod
  
  /**
    * A ConnectionHttpParameters object that contains details about the additional parameters to use for the connection.
    */
  var OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
}
object CreateConnectionOAuthRequestParameters {
  
  inline def apply(
    AuthorizationEndpoint: HttpsEndpoint,
    ClientParameters: CreateConnectionOAuthClientRequestParameters,
    HttpMethod: ConnectionOAuthHttpMethod
  ): CreateConnectionOAuthRequestParameters = {
    val __obj = js.Dynamic.literal(AuthorizationEndpoint = AuthorizationEndpoint.asInstanceOf[js.Any], ClientParameters = ClientParameters.asInstanceOf[js.Any], HttpMethod = HttpMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionOAuthRequestParameters]
  }
  
  extension [Self <: CreateConnectionOAuthRequestParameters](x: Self) {
    
    inline def setAuthorizationEndpoint(value: HttpsEndpoint): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClientParameters(value: CreateConnectionOAuthClientRequestParameters): Self = StObject.set(x, "ClientParameters", value.asInstanceOf[js.Any])
    
    inline def setHttpMethod(value: ConnectionOAuthHttpMethod): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    inline def setOAuthHttpParameters(value: ConnectionHttpParameters): Self = StObject.set(x, "OAuthHttpParameters", value.asInstanceOf[js.Any])
    
    inline def setOAuthHttpParametersUndefined: Self = StObject.set(x, "OAuthHttpParameters", js.undefined)
  }
}
