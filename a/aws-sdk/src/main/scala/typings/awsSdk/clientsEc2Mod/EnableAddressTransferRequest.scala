package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAddressTransferRequest extends StObject {
  
  /**
    * The allocation ID of an Elastic IP address.
    */
  var AllocationId: typings.awsSdk.clientsEc2Mod.AllocationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the account that you want to transfer the Elastic IP address to.
    */
  var TransferAccountId: String
}
object EnableAddressTransferRequest {
  
  inline def apply(AllocationId: AllocationId, TransferAccountId: String): EnableAddressTransferRequest = {
    val __obj = js.Dynamic.literal(AllocationId = AllocationId.asInstanceOf[js.Any], TransferAccountId = TransferAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAddressTransferRequest]
  }
  
  extension [Self <: EnableAddressTransferRequest](x: Self) {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransferAccountId(value: String): Self = StObject.set(x, "TransferAccountId", value.asInstanceOf[js.Any])
  }
}
