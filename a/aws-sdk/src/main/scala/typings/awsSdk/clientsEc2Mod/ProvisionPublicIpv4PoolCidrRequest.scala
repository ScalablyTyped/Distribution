package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionPublicIpv4PoolCidrRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM pool you would like to use to allocate this CIDR.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
  
  /**
    * The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
    */
  var NetmaskLength: Integer
  
  /**
    * The ID of the public IPv4 pool you would like to use for this CIDR.
    */
  var PoolId: Ipv4PoolEc2Id
}
object ProvisionPublicIpv4PoolCidrRequest {
  
  inline def apply(IpamPoolId: IpamPoolId, NetmaskLength: Integer, PoolId: Ipv4PoolEc2Id): ProvisionPublicIpv4PoolCidrRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any], NetmaskLength = NetmaskLength.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionPublicIpv4PoolCidrRequest]
  }
  
  extension [Self <: ProvisionPublicIpv4PoolCidrRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setNetmaskLength(value: Integer): Self = StObject.set(x, "NetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
