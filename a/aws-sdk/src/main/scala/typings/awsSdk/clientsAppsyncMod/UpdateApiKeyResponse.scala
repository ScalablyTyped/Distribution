package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApiKeyResponse extends StObject {
  
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.undefined
}
object UpdateApiKeyResponse {
  
  inline def apply(): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
  
  extension [Self <: UpdateApiKeyResponse](x: Self) {
    
    inline def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
