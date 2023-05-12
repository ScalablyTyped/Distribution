package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateNatGatewayAddressRequest extends StObject {
  
  /**
    * The association IDs of EIPs that have been associated with the NAT gateway.
    */
  var AssociationIds: EipAssociationIdList
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections are still in progress. Default value is 350 seconds.
    */
  var MaxDrainDurationSeconds: js.UndefOr[DrainSeconds] = js.undefined
  
  /**
    * The NAT gateway ID.
    */
  var NatGatewayId: typings.awsSdk.clientsEc2Mod.NatGatewayId
}
object DisassociateNatGatewayAddressRequest {
  
  inline def apply(AssociationIds: EipAssociationIdList, NatGatewayId: NatGatewayId): DisassociateNatGatewayAddressRequest = {
    val __obj = js.Dynamic.literal(AssociationIds = AssociationIds.asInstanceOf[js.Any], NatGatewayId = NatGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateNatGatewayAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateNatGatewayAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationIds(value: EipAssociationIdList): Self = StObject.set(x, "AssociationIds", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdsVarargs(value: ElasticIpAssociationId*): Self = StObject.set(x, "AssociationIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxDrainDurationSeconds(value: DrainSeconds): Self = StObject.set(x, "MaxDrainDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxDrainDurationSecondsUndefined: Self = StObject.set(x, "MaxDrainDurationSeconds", js.undefined)
    
    inline def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
  }
}
