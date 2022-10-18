package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprovisionIpamPoolCidrRequest extends StObject {
  
  /**
    * The CIDR which you want to deprovision from the pool.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the pool that has the CIDR you want to deprovision.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
}
object DeprovisionIpamPoolCidrRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): DeprovisionIpamPoolCidrRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprovisionIpamPoolCidrRequest]
  }
  
  extension [Self <: DeprovisionIpamPoolCidrRequest](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
  }
}
