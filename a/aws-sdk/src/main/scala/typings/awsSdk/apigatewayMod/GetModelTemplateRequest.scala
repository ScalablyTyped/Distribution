package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelTemplateRequest extends StObject {
  
  /**
    * The name of the model for which to generate a template.
    */
  var modelName: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetModelTemplateRequest {
  
  inline def apply(modelName: String, restApiId: String): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
  
  extension [Self <: GetModelTemplateRequest](x: Self) {
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
