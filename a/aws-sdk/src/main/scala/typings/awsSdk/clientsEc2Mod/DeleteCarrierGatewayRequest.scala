package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCarrierGatewayRequest extends StObject {
  
  /**
    * The ID of the carrier gateway.
    */
  var CarrierGatewayId: typings.awsSdk.clientsEc2Mod.CarrierGatewayId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteCarrierGatewayRequest {
  
  inline def apply(CarrierGatewayId: CarrierGatewayId): DeleteCarrierGatewayRequest = {
    val __obj = js.Dynamic.literal(CarrierGatewayId = CarrierGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCarrierGatewayRequest]
  }
  
  extension [Self <: DeleteCarrierGatewayRequest](x: Self) {
    
    inline def setCarrierGatewayId(value: CarrierGatewayId): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
