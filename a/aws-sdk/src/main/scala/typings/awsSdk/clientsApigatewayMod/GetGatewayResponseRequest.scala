package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayResponseRequest extends StObject {
  
  /**
    * The response type of the associated GatewayResponse.
    */
  var responseType: GatewayResponseType
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetGatewayResponseRequest {
  
  inline def apply(responseType: GatewayResponseType, restApiId: String): GetGatewayResponseRequest = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayResponseRequest]
  }
  
  extension [Self <: GetGatewayResponseRequest](x: Self) {
    
    inline def setResponseType(value: GatewayResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
