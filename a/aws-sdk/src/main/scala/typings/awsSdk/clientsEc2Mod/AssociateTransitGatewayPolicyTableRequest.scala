package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayPolicyTableRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the transit gateway attachment to associate with the policy table.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId
  
  /**
    * The ID of the transit gateway policy table to associate with the transit gateway attachment.
    */
  var TransitGatewayPolicyTableId: typings.awsSdk.clientsEc2Mod.TransitGatewayPolicyTableId
}
object AssociateTransitGatewayPolicyTableRequest {
  
  inline def apply(
    TransitGatewayAttachmentId: TransitGatewayAttachmentId,
    TransitGatewayPolicyTableId: TransitGatewayPolicyTableId
  ): AssociateTransitGatewayPolicyTableRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any], TransitGatewayPolicyTableId = TransitGatewayPolicyTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTransitGatewayPolicyTableRequest]
  }
  
  extension [Self <: AssociateTransitGatewayPolicyTableRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableId(value: TransitGatewayPolicyTableId): Self = StObject.set(x, "TransitGatewayPolicyTableId", value.asInstanceOf[js.Any])
  }
}
