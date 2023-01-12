package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIpv4Prefix extends StObject {
  
  /**
    * One or more IPv4 prefixes assigned to the network interface.
    */
  var Ipv4Prefix: js.UndefOr[String] = js.undefined
}
object InstanceIpv4Prefix {
  
  inline def apply(): InstanceIpv4Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv4Prefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceIpv4Prefix] (val x: Self) extends AnyVal {
    
    inline def setIpv4Prefix(value: String): Self = StObject.set(x, "Ipv4Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixUndefined: Self = StObject.set(x, "Ipv4Prefix", js.undefined)
  }
}
