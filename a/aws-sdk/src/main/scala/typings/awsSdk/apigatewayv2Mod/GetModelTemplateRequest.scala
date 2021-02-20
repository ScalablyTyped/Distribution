package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModelTemplateRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The model ID.
    */
  var ModelId: string = js.native
}
object GetModelTemplateRequest {
  
  @scala.inline
  def apply(ApiId: string, ModelId: string): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
  
  @scala.inline
  implicit class GetModelTemplateRequestMutableBuilder[Self <: GetModelTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelId(value: string): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
  }
}
