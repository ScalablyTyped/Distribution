package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrunkInterfaceRequest extends StObject {
  
  /**
    * The ID of the branch network interface.
    */
  var BranchInterfaceId: NetworkInterfaceId
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The application key. This applies to the GRE protocol.
    */
  var GreKey: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the trunk network interface.
    */
  var TrunkInterfaceId: NetworkInterfaceId
  
  /**
    * The ID of the VLAN. This applies to the VLAN protocol.
    */
  var VlanId: js.UndefOr[Integer] = js.undefined
}
object AssociateTrunkInterfaceRequest {
  
  inline def apply(BranchInterfaceId: NetworkInterfaceId, TrunkInterfaceId: NetworkInterfaceId): AssociateTrunkInterfaceRequest = {
    val __obj = js.Dynamic.literal(BranchInterfaceId = BranchInterfaceId.asInstanceOf[js.Any], TrunkInterfaceId = TrunkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrunkInterfaceRequest]
  }
  
  extension [Self <: AssociateTrunkInterfaceRequest](x: Self) {
    
    inline def setBranchInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "BranchInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGreKey(value: Integer): Self = StObject.set(x, "GreKey", value.asInstanceOf[js.Any])
    
    inline def setGreKeyUndefined: Self = StObject.set(x, "GreKey", js.undefined)
    
    inline def setTrunkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "TrunkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVlanId(value: Integer): Self = StObject.set(x, "VlanId", value.asInstanceOf[js.Any])
    
    inline def setVlanIdUndefined: Self = StObject.set(x, "VlanId", js.undefined)
  }
}
