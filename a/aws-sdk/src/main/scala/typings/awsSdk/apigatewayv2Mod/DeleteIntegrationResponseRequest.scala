package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntegrationResponseRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The integration ID.
    */
  var IntegrationId: string
  
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: string
}
object DeleteIntegrationResponseRequest {
  
  @scala.inline
  def apply(ApiId: string, IntegrationId: string, IntegrationResponseId: string): DeleteIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any], IntegrationResponseId = IntegrationResponseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntegrationResponseRequest]
  }
  
  @scala.inline
  implicit class DeleteIntegrationResponseRequestMutableBuilder[Self <: DeleteIntegrationResponseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationId(value: string): Self = StObject.set(x, "IntegrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationResponseId(value: string): Self = StObject.set(x, "IntegrationResponseId", value.asInstanceOf[js.Any])
  }
}
