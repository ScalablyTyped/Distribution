package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationResponseRequest extends StObject {
  
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
object GetIntegrationResponseRequest {
  
  inline def apply(ApiId: string, IntegrationId: string, IntegrationResponseId: string): GetIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any], IntegrationResponseId = IntegrationResponseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationResponseRequest]
  }
  
  extension [Self <: GetIntegrationResponseRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationId(value: string): Self = StObject.set(x, "IntegrationId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationResponseId(value: string): Self = StObject.set(x, "IntegrationResponseId", value.asInstanceOf[js.Any])
  }
}
