package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomerGatewayRequest extends StObject {
  
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typings.awsSdk.clientsEc2Mod.CustomerGatewayId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteCustomerGatewayRequest {
  
  inline def apply(CustomerGatewayId: CustomerGatewayId): DeleteCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerGatewayRequest]
  }
  
  extension [Self <: DeleteCustomerGatewayRequest](x: Self) {
    
    inline def setCustomerGatewayId(value: CustomerGatewayId): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
