package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteModelRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The model ID.
    */
  var ModelId: string = js.native
}
object DeleteModelRequest {
  
  @scala.inline
  def apply(ApiId: string, ModelId: string): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelRequest]
  }
  
  @scala.inline
  implicit class DeleteModelRequestMutableBuilder[Self <: DeleteModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelId(value: string): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
  }
}
