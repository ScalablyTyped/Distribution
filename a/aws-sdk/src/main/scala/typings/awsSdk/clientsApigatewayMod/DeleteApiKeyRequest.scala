package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiKeyRequest extends StObject {
  
  /**
    * The identifier of the ApiKey resource to be deleted.
    */
  var apiKey: String
}
object DeleteApiKeyRequest {
  
  inline def apply(apiKey: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
  
  extension [Self <: DeleteApiKeyRequest](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
  }
}
