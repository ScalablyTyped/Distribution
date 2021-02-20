package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModelTemplateRequest extends StObject {
  
  /**
    * [Required] The name of the model for which to generate a template.
    */
  var modelName: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object GetModelTemplateRequest {
  
  @scala.inline
  def apply(modelName: String, restApiId: String): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
  
  @scala.inline
  implicit class GetModelTemplateRequestMutableBuilder[Self <: GetModelTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
