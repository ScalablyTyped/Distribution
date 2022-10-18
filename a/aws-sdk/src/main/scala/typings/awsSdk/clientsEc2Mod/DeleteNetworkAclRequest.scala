package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkAclRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typings.awsSdk.clientsEc2Mod.NetworkAclId
}
object DeleteNetworkAclRequest {
  
  inline def apply(NetworkAclId: NetworkAclId): DeleteNetworkAclRequest = {
    val __obj = js.Dynamic.literal(NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkAclRequest]
  }
  
  extension [Self <: DeleteNetworkAclRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkAclId(value: NetworkAclId): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
  }
}
