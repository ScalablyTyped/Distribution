package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIpv6AddressRequest extends StObject {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.undefined
}
object InstanceIpv6AddressRequest {
  
  inline def apply(): InstanceIpv6AddressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv6AddressRequest]
  }
  
  extension [Self <: InstanceIpv6AddressRequest](x: Self) {
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
  }
}
