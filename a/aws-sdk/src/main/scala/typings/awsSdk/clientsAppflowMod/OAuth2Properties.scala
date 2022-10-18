package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2Properties extends StObject {
  
  /**
    * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
    */
  var oAuth2GrantType: OAuth2GrantType
  
  /**
    * The token URL required for OAuth 2.0 authentication.
    */
  var tokenUrl: TokenUrl
  
  /**
    * Associates your token URL with a map of properties that you define. Use this parameter to provide any additional details that the connector requires to authenticate your request.
    */
  var tokenUrlCustomProperties: js.UndefOr[TokenUrlCustomProperties] = js.undefined
}
object OAuth2Properties {
  
  inline def apply(oAuth2GrantType: OAuth2GrantType, tokenUrl: TokenUrl): OAuth2Properties = {
    val __obj = js.Dynamic.literal(oAuth2GrantType = oAuth2GrantType.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Properties]
  }
  
  extension [Self <: OAuth2Properties](x: Self) {
    
    inline def setOAuth2GrantType(value: OAuth2GrantType): Self = StObject.set(x, "oAuth2GrantType", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: TokenUrl): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    
    inline def setTokenUrlCustomProperties(value: TokenUrlCustomProperties): Self = StObject.set(x, "tokenUrlCustomProperties", value.asInstanceOf[js.Any])
    
    inline def setTokenUrlCustomPropertiesUndefined: Self = StObject.set(x, "tokenUrlCustomProperties", js.undefined)
  }
}
