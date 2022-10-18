package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionAuthRequestParameters extends StObject {
  
  /**
    * A UpdateConnectionApiKeyAuthRequestParameters object that contains the authorization parameters for API key authorization.
    */
  var ApiKeyAuthParameters: js.UndefOr[UpdateConnectionApiKeyAuthRequestParameters] = js.undefined
  
  /**
    * A UpdateConnectionBasicAuthRequestParameters object that contains the authorization parameters for Basic authorization.
    */
  var BasicAuthParameters: js.UndefOr[UpdateConnectionBasicAuthRequestParameters] = js.undefined
  
  /**
    * A ConnectionHttpParameters object that contains the additional parameters to use for the connection.
    */
  var InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
  
  /**
    * A UpdateConnectionOAuthRequestParameters object that contains the authorization parameters for OAuth authorization.
    */
  var OAuthParameters: js.UndefOr[UpdateConnectionOAuthRequestParameters] = js.undefined
}
object UpdateConnectionAuthRequestParameters {
  
  inline def apply(): UpdateConnectionAuthRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectionAuthRequestParameters]
  }
  
  extension [Self <: UpdateConnectionAuthRequestParameters](x: Self) {
    
    inline def setApiKeyAuthParameters(value: UpdateConnectionApiKeyAuthRequestParameters): Self = StObject.set(x, "ApiKeyAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setApiKeyAuthParametersUndefined: Self = StObject.set(x, "ApiKeyAuthParameters", js.undefined)
    
    inline def setBasicAuthParameters(value: UpdateConnectionBasicAuthRequestParameters): Self = StObject.set(x, "BasicAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthParametersUndefined: Self = StObject.set(x, "BasicAuthParameters", js.undefined)
    
    inline def setInvocationHttpParameters(value: ConnectionHttpParameters): Self = StObject.set(x, "InvocationHttpParameters", value.asInstanceOf[js.Any])
    
    inline def setInvocationHttpParametersUndefined: Self = StObject.set(x, "InvocationHttpParameters", js.undefined)
    
    inline def setOAuthParameters(value: UpdateConnectionOAuthRequestParameters): Self = StObject.set(x, "OAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setOAuthParametersUndefined: Self = StObject.set(x, "OAuthParameters", js.undefined)
  }
}
