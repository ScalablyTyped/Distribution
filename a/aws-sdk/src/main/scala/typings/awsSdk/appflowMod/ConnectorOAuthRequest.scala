package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorOAuthRequest extends StObject {
  
  /**
    *  The code provided by the connector when it has been authenticated via the connected app. 
    */
  var authCode: js.UndefOr[AuthCode] = js.undefined
  
  /**
    *  The URL to which the authentication server redirects the browser after authorization has been granted. 
    */
  var redirectUri: js.UndefOr[RedirectUri] = js.undefined
}
object ConnectorOAuthRequest {
  
  inline def apply(): ConnectorOAuthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorOAuthRequest]
  }
  
  extension [Self <: ConnectorOAuthRequest](x: Self) {
    
    inline def setAuthCode(value: AuthCode): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
    
    inline def setRedirectUri(value: RedirectUri): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
