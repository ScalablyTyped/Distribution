package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionIpamPoolCidrRequest extends StObject {
  
  /**
    * The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value will be null if you specify "NetmaskLength" and will be filled in during the provisioning process.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using BYOIP. This option applies to public pools only.
    */
  var CidrAuthorizationContext: js.UndefOr[IpamCidrAuthorizationContext] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM pool to which you want to assign a CIDR.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
  
  /**
    * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
    */
  var NetmaskLength: js.UndefOr[Integer] = js.undefined
}
object ProvisionIpamPoolCidrRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): ProvisionIpamPoolCidrRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionIpamPoolCidrRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionIpamPoolCidrRequest] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrAuthorizationContext(value: IpamCidrAuthorizationContext): Self = StObject.set(x, "CidrAuthorizationContext", value.asInstanceOf[js.Any])
    
    inline def setCidrAuthorizationContextUndefined: Self = StObject.set(x, "CidrAuthorizationContext", js.undefined)
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setNetmaskLength(value: Integer): Self = StObject.set(x, "NetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setNetmaskLengthUndefined: Self = StObject.set(x, "NetmaskLength", js.undefined)
  }
}
