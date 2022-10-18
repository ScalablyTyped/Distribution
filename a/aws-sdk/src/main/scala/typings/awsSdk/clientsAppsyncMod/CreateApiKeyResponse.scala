package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyResponse extends StObject {
  
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.undefined
}
object CreateApiKeyResponse {
  
  inline def apply(): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
  
  extension [Self <: CreateApiKeyResponse](x: Self) {
    
    inline def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
