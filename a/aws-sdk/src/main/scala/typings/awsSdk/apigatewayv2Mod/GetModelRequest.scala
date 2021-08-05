package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The model ID.
    */
  var ModelId: string
}
object GetModelRequest {
  
  inline def apply(ApiId: string, ModelId: string): GetModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelRequest]
  }
  
  extension [Self <: GetModelRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setModelId(value: string): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
  }
}
