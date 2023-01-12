package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6PrefixSpecification extends StObject {
  
  /**
    * The IPv6 prefix.
    */
  var Ipv6Prefix: js.UndefOr[String] = js.undefined
}
object Ipv6PrefixSpecification {
  
  inline def apply(): Ipv6PrefixSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6PrefixSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ipv6PrefixSpecification] (val x: Self) extends AnyVal {
    
    inline def setIpv6Prefix(value: String): Self = StObject.set(x, "Ipv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixUndefined: Self = StObject.set(x, "Ipv6Prefix", js.undefined)
  }
}
