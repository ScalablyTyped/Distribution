package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcPeeringConnectionOptionsRequest extends StObject {
  
  /**
    * The VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: typings.awsSdk.clientsEc2Mod.VpcPeeringConnectionId
}
object ModifyVpcPeeringConnectionOptionsRequest {
  
  inline def apply(VpcPeeringConnectionId: VpcPeeringConnectionId): ModifyVpcPeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
  }
  
  extension [Self <: ModifyVpcPeeringConnectionOptionsRequest](x: Self) {
    
    inline def setAccepterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = StObject.set(x, "AccepterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    inline def setAccepterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "AccepterPeeringConnectionOptions", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setRequesterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = StObject.set(x, "RequesterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    inline def setRequesterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "RequesterPeeringConnectionOptions", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
  }
}
