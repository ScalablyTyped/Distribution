package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseIpamPoolAllocationRequest extends StObject {
  
  /**
    * The CIDR of the allocation you want to release.
    */
  var Cidr: String
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the allocation.
    */
  var IpamPoolAllocationId: typings.awsSdk.clientsEc2Mod.IpamPoolAllocationId
  
  /**
    * The ID of the IPAM pool which contains the allocation you want to release.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
}
object ReleaseIpamPoolAllocationRequest {
  
  inline def apply(Cidr: String, IpamPoolAllocationId: IpamPoolAllocationId, IpamPoolId: IpamPoolId): ReleaseIpamPoolAllocationRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], IpamPoolAllocationId = IpamPoolAllocationId.asInstanceOf[js.Any], IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseIpamPoolAllocationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseIpamPoolAllocationRequest] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolAllocationId(value: IpamPoolAllocationId): Self = StObject.set(x, "IpamPoolAllocationId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
  }
}
