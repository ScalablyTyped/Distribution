package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayPolicyTableRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transit gateway policy table to delete.
    */
  var TransitGatewayPolicyTableId: typings.awsSdk.clientsEc2Mod.TransitGatewayPolicyTableId
}
object DeleteTransitGatewayPolicyTableRequest {
  
  inline def apply(TransitGatewayPolicyTableId: TransitGatewayPolicyTableId): DeleteTransitGatewayPolicyTableRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayPolicyTableId = TransitGatewayPolicyTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayPolicyTableRequest]
  }
  
  extension [Self <: DeleteTransitGatewayPolicyTableRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayPolicyTableId(value: TransitGatewayPolicyTableId): Self = StObject.set(x, "TransitGatewayPolicyTableId", value.asInstanceOf[js.Any])
  }
}
