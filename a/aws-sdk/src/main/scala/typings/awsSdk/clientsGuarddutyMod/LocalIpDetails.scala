package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalIpDetails extends StObject {
  
  /**
    * The IPv4 local address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.undefined
}
object LocalIpDetails {
  
  inline def apply(): LocalIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIpDetails]
  }
  
  extension [Self <: LocalIpDetails](x: Self) {
    
    inline def setIpAddressV4(value: String): Self = StObject.set(x, "IpAddressV4", value.asInstanceOf[js.Any])
    
    inline def setIpAddressV4Undefined: Self = StObject.set(x, "IpAddressV4", js.undefined)
  }
}
