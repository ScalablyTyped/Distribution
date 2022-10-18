package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIpv6Address extends StObject {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.undefined
}
object InstanceIpv6Address {
  
  inline def apply(): InstanceIpv6Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv6Address]
  }
  
  extension [Self <: InstanceIpv6Address](x: Self) {
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
  }
}
