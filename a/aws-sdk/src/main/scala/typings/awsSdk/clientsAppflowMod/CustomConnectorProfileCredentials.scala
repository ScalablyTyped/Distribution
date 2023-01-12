package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConnectorProfileCredentials extends StObject {
  
  /**
    * The API keys required for the authentication of the user.
    */
  var apiKey: js.UndefOr[ApiKeyCredentials] = js.undefined
  
  /**
    * The authentication type that the custom connector uses for authenticating while creating a connector profile.
    */
  var authenticationType: AuthenticationType
  
  /**
    * The basic credentials that are required for the authentication of the user.
    */
  var basic: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    * If the connector uses the custom authentication mechanism, this holds the required credentials.
    */
  var custom: js.UndefOr[CustomAuthCredentials] = js.undefined
  
  /**
    * The OAuth 2.0 credentials required for the authentication of the user.
    */
  var oauth2: js.UndefOr[OAuth2Credentials] = js.undefined
}
object CustomConnectorProfileCredentials {
  
  inline def apply(authenticationType: AuthenticationType): CustomConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: ApiKeyCredentials): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setBasic(value: BasicAuthCredentials): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setCustom(value: CustomAuthCredentials): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setOauth2(value: OAuth2Credentials): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    inline def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
  }
}
