package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprovisionPublicIpv4PoolCidrRequest extends StObject {
  
  /**
    * The CIDR you want to deprovision from the pool. Enter the CIDR you want to deprovision with a netmask of /32. You must rerun this command for each IP address in the CIDR range. If your CIDR is a /24, you will have to run this command to deprovision each of the 256 IP addresses in the /24 CIDR.
    */
  var Cidr: String
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the pool that you want to deprovision the CIDR from.
    */
  var PoolId: Ipv4PoolEc2Id
}
object DeprovisionPublicIpv4PoolCidrRequest {
  
  inline def apply(Cidr: String, PoolId: Ipv4PoolEc2Id): DeprovisionPublicIpv4PoolCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprovisionPublicIpv4PoolCidrRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprovisionPublicIpv4PoolCidrRequest] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPoolId(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
