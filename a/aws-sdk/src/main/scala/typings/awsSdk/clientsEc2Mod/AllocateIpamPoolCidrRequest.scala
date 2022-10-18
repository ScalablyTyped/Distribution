package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateIpamPoolCidrRequest extends StObject {
  
  /**
    * The CIDR you would like to allocate from the IPAM pool. Note the following:   If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or the CIDR.   If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.   Possible values: Any available IPv4 or IPv6 CIDR.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the allocation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using netmask length for allocation.
    */
  var DisallowedCidrs: js.UndefOr[IpamPoolAllocationDisallowedCidrs] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM pool from which you would like to allocate a CIDR.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
  
  /**
    * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:   If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or the CIDR.   If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.   Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
    */
  var NetmaskLength: js.UndefOr[Integer] = js.undefined
  
  /**
    * A preview of the next available CIDR in a pool.
    */
  var PreviewNextCidr: js.UndefOr[Boolean] = js.undefined
}
object AllocateIpamPoolCidrRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): AllocateIpamPoolCidrRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateIpamPoolCidrRequest]
  }
  
  extension [Self <: AllocateIpamPoolCidrRequest](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisallowedCidrs(value: IpamPoolAllocationDisallowedCidrs): Self = StObject.set(x, "DisallowedCidrs", value.asInstanceOf[js.Any])
    
    inline def setDisallowedCidrsUndefined: Self = StObject.set(x, "DisallowedCidrs", js.undefined)
    
    inline def setDisallowedCidrsVarargs(value: String*): Self = StObject.set(x, "DisallowedCidrs", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setNetmaskLength(value: Integer): Self = StObject.set(x, "NetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setNetmaskLengthUndefined: Self = StObject.set(x, "NetmaskLength", js.undefined)
    
    inline def setPreviewNextCidr(value: Boolean): Self = StObject.set(x, "PreviewNextCidr", value.asInstanceOf[js.Any])
    
    inline def setPreviewNextCidrUndefined: Self = StObject.set(x, "PreviewNextCidr", js.undefined)
  }
}
