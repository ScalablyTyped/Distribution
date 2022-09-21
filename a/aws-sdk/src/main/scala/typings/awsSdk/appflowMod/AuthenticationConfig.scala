package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationConfig extends StObject {
  
  /**
    * Contains information required for custom authentication.
    */
  var customAuthConfigs: js.UndefOr[CustomAuthConfigList] = js.undefined
  
  /**
    * Indicates whether API key authentication is supported by the connector
    */
  var isApiKeyAuthSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether basic authentication is supported by the connector.
    */
  var isBasicAuthSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether custom authentication is supported by the connector
    */
  var isCustomAuthSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether OAuth 2.0 authentication is supported by the connector.
    */
  var isOAuth2Supported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains the default values required for OAuth 2.0 authentication.
    */
  var oAuth2Defaults: js.UndefOr[OAuth2Defaults] = js.undefined
}
object AuthenticationConfig {
  
  inline def apply(): AuthenticationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationConfig]
  }
  
  extension [Self <: AuthenticationConfig](x: Self) {
    
    inline def setCustomAuthConfigs(value: CustomAuthConfigList): Self = StObject.set(x, "customAuthConfigs", value.asInstanceOf[js.Any])
    
    inline def setCustomAuthConfigsUndefined: Self = StObject.set(x, "customAuthConfigs", js.undefined)
    
    inline def setCustomAuthConfigsVarargs(value: CustomAuthConfig*): Self = StObject.set(x, "customAuthConfigs", js.Array(value*))
    
    inline def setIsApiKeyAuthSupported(value: Boolean): Self = StObject.set(x, "isApiKeyAuthSupported", value.asInstanceOf[js.Any])
    
    inline def setIsApiKeyAuthSupportedUndefined: Self = StObject.set(x, "isApiKeyAuthSupported", js.undefined)
    
    inline def setIsBasicAuthSupported(value: Boolean): Self = StObject.set(x, "isBasicAuthSupported", value.asInstanceOf[js.Any])
    
    inline def setIsBasicAuthSupportedUndefined: Self = StObject.set(x, "isBasicAuthSupported", js.undefined)
    
    inline def setIsCustomAuthSupported(value: Boolean): Self = StObject.set(x, "isCustomAuthSupported", value.asInstanceOf[js.Any])
    
    inline def setIsCustomAuthSupportedUndefined: Self = StObject.set(x, "isCustomAuthSupported", js.undefined)
    
    inline def setIsOAuth2Supported(value: Boolean): Self = StObject.set(x, "isOAuth2Supported", value.asInstanceOf[js.Any])
    
    inline def setIsOAuth2SupportedUndefined: Self = StObject.set(x, "isOAuth2Supported", js.undefined)
    
    inline def setOAuth2Defaults(value: OAuth2Defaults): Self = StObject.set(x, "oAuth2Defaults", value.asInstanceOf[js.Any])
    
    inline def setOAuth2DefaultsUndefined: Self = StObject.set(x, "oAuth2Defaults", js.undefined)
  }
}
