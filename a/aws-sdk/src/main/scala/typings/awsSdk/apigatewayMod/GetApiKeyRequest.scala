package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiKeyRequest extends StObject {
  
  /**
    * The identifier of the ApiKey resource.
    */
  var apiKey: String
  
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains the key value.
    */
  var includeValue: js.UndefOr[NullableBoolean] = js.undefined
}
object GetApiKeyRequest {
  
  inline def apply(apiKey: String): GetApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyRequest]
  }
  
  extension [Self <: GetApiKeyRequest](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setIncludeValue(value: NullableBoolean): Self = StObject.set(x, "includeValue", value.asInstanceOf[js.Any])
    
    inline def setIncludeValueUndefined: Self = StObject.set(x, "includeValue", js.undefined)
  }
}
