package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceNetworkAclAssociationRequest extends StObject {
  
  /**
    * The ID of the current association between the original network ACL and the subnet.
    */
  var AssociationId: NetworkAclAssociationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the new network ACL to associate with the subnet.
    */
  var NetworkAclId: typings.awsSdk.clientsEc2Mod.NetworkAclId
}
object ReplaceNetworkAclAssociationRequest {
  
  inline def apply(AssociationId: NetworkAclAssociationId, NetworkAclId: NetworkAclId): ReplaceNetworkAclAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceNetworkAclAssociationRequest]
  }
  
  extension [Self <: ReplaceNetworkAclAssociationRequest](x: Self) {
    
    inline def setAssociationId(value: NetworkAclAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkAclId(value: NetworkAclId): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
  }
}
