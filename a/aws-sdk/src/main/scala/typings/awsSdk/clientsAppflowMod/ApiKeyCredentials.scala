package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyCredentials extends StObject {
  
  /**
    * The API key required for API key authentication.
    */
  var apiKey: ApiKey
  
  /**
    * The API secret key required for API key authentication.
    */
  var apiSecretKey: js.UndefOr[ApiSecretKey] = js.undefined
}
object ApiKeyCredentials {
  
  inline def apply(apiKey: ApiKey): ApiKeyCredentials = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyCredentials]
  }
  
  extension [Self <: ApiKeyCredentials](x: Self) {
    
    inline def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiSecretKey(value: ApiSecretKey): Self = StObject.set(x, "apiSecretKey", value.asInstanceOf[js.Any])
    
    inline def setApiSecretKeyUndefined: Self = StObject.set(x, "apiSecretKey", js.undefined)
  }
}
