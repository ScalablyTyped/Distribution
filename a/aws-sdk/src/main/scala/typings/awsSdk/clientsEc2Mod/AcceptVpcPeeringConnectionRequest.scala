package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptVpcPeeringConnectionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC peering connection. You must specify this parameter in the request.
    */
  var VpcPeeringConnectionId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpcPeeringConnectionId] = js.undefined
}
object AcceptVpcPeeringConnectionRequest {
  
  inline def apply(): AcceptVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptVpcPeeringConnectionRequest]
  }
  
  extension [Self <: AcceptVpcPeeringConnectionRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
