package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelTemplateRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The model ID.
    */
  var ModelId: string
}
object GetModelTemplateRequest {
  
  inline def apply(ApiId: string, ModelId: string): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
  
  extension [Self <: GetModelTemplateRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setModelId(value: string): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
  }
}
