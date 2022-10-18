package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayRequest extends StObject {
  
  /**
    * The ID of the gateway to update.
    */
  var gatewayId: ID
  
  /**
    * A unique, friendly name for the gateway.
    */
  var gatewayName: Name
}
object UpdateGatewayRequest {
  
  inline def apply(gatewayId: ID, gatewayName: Name): UpdateGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRequest]
  }
  
  extension [Self <: UpdateGatewayRequest](x: Self) {
    
    inline def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayName(value: Name): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
  }
}
