package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiKeyRequest extends StObject {
  
  /**
    * [Required] The identifier of the ApiKey resource.
    */
  var apiKey: String
  
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains the key value.
    */
  var includeValue: js.UndefOr[NullableBoolean] = js.undefined
}
object GetApiKeyRequest {
  
  @scala.inline
  def apply(apiKey: String): GetApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyRequest]
  }
  
  @scala.inline
  implicit class GetApiKeyRequestMutableBuilder[Self <: GetApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValue(value: NullableBoolean): Self = StObject.set(x, "includeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValueUndefined: Self = StObject.set(x, "includeValue", js.undefined)
  }
}
