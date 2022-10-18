package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoneycodeConnectorProfileCredentials extends StObject {
  
  /**
    *  The credentials used to access protected Amazon Honeycode resources. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.undefined
  
  var oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
  
  /**
    *  The credentials used to acquire new access tokens. 
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.undefined
}
object HoneycodeConnectorProfileCredentials {
  
  inline def apply(): HoneycodeConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoneycodeConnectorProfileCredentials]
  }
  
  extension [Self <: HoneycodeConnectorProfileCredentials](x: Self) {
    
    inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setOAuthRequest(value: ConnectorOAuthRequest): Self = StObject.set(x, "oAuthRequest", value.asInstanceOf[js.Any])
    
    inline def setOAuthRequestUndefined: Self = StObject.set(x, "oAuthRequest", js.undefined)
    
    inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
