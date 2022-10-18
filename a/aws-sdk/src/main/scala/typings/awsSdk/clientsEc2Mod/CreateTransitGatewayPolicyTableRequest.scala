package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPolicyTableRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags specification for the transit gateway policy table created during the request.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the transit gateway used for the policy table.
    */
  var TransitGatewayId: typings.awsSdk.clientsEc2Mod.TransitGatewayId
}
object CreateTransitGatewayPolicyTableRequest {
  
  inline def apply(TransitGatewayId: TransitGatewayId): CreateTransitGatewayPolicyTableRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPolicyTableRequest]
  }
  
  extension [Self <: CreateTransitGatewayPolicyTableRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
  }
}
