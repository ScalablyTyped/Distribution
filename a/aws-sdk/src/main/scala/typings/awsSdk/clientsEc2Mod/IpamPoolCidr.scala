package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamPoolCidr extends StObject {
  
  /**
    * The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated network mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is 10.24.34.0/23. An IPv6 CIDR example is 2001:DB8::/32.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * Details related to why an IPAM pool CIDR failed to be provisioned.
    */
  var FailureReason: js.UndefOr[IpamPoolCidrFailureReason] = js.undefined
  
  /**
    * The state of the CIDR.
    */
  var State: js.UndefOr[IpamPoolCidrState] = js.undefined
}
object IpamPoolCidr {
  
  inline def apply(): IpamPoolCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamPoolCidr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamPoolCidr] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setFailureReason(value: IpamPoolCidrFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setState(value: IpamPoolCidrState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
