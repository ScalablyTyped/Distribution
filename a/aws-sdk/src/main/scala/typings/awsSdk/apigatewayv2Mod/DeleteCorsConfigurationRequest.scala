package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCorsConfigurationRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
}
object DeleteCorsConfigurationRequest {
  
  @scala.inline
  def apply(ApiId: string): DeleteCorsConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCorsConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteCorsConfigurationRequestMutableBuilder[Self <: DeleteCorsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
  }
}
