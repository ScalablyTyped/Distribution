package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayMulticastDomainRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the subnets;
    */
  var SubnetIds: TransitGatewaySubnetIdList
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: typings.awsSdk.clientsEc2Mod.TransitGatewayMulticastDomainId
}
object DisassociateTransitGatewayMulticastDomainRequest {
  
  inline def apply(
    SubnetIds: TransitGatewaySubnetIdList,
    TransitGatewayAttachmentId: TransitGatewayAttachmentId,
    TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId
  ): DisassociateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any], TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any], TransitGatewayMulticastDomainId = TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSubnetIds(value: TransitGatewaySubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
  }
}
