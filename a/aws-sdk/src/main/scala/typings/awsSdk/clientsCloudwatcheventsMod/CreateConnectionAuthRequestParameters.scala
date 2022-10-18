package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionAuthRequestParameters extends StObject {
  
  /**
    * A CreateConnectionApiKeyAuthRequestParameters object that contains the API key authorization parameters to use for the connection.
    */
  var ApiKeyAuthParameters: js.UndefOr[CreateConnectionApiKeyAuthRequestParameters] = js.undefined
  
  /**
    * A CreateConnectionBasicAuthRequestParameters object that contains the Basic authorization parameters to use for the connection.
    */
  var BasicAuthParameters: js.UndefOr[CreateConnectionBasicAuthRequestParameters] = js.undefined
  
  /**
    * A ConnectionHttpParameters object that contains the API key authorization parameters to use for the connection. Note that if you include additional parameters for the target of a rule via HttpParameters, including query strings, the parameters added for the connection take precedence.
    */
  var InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
  
  /**
    * A CreateConnectionOAuthRequestParameters object that contains the OAuth authorization parameters to use for the connection.
    */
  var OAuthParameters: js.UndefOr[CreateConnectionOAuthRequestParameters] = js.undefined
}
object CreateConnectionAuthRequestParameters {
  
  inline def apply(): CreateConnectionAuthRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectionAuthRequestParameters]
  }
  
  extension [Self <: CreateConnectionAuthRequestParameters](x: Self) {
    
    inline def setApiKeyAuthParameters(value: CreateConnectionApiKeyAuthRequestParameters): Self = StObject.set(x, "ApiKeyAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setApiKeyAuthParametersUndefined: Self = StObject.set(x, "ApiKeyAuthParameters", js.undefined)
    
    inline def setBasicAuthParameters(value: CreateConnectionBasicAuthRequestParameters): Self = StObject.set(x, "BasicAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthParametersUndefined: Self = StObject.set(x, "BasicAuthParameters", js.undefined)
    
    inline def setInvocationHttpParameters(value: ConnectionHttpParameters): Self = StObject.set(x, "InvocationHttpParameters", value.asInstanceOf[js.Any])
    
    inline def setInvocationHttpParametersUndefined: Self = StObject.set(x, "InvocationHttpParameters", js.undefined)
    
    inline def setOAuthParameters(value: CreateConnectionOAuthRequestParameters): Self = StObject.set(x, "OAuthParameters", value.asInstanceOf[js.Any])
    
    inline def setOAuthParametersUndefined: Self = StObject.set(x, "OAuthParameters", js.undefined)
  }
}
