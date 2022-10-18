package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv4PrefixSpecification extends StObject {
  
  /**
    * The IPv4 prefix. For information, see  Assigning prefixes to Amazon EC2 network interfaces in the Amazon Elastic Compute Cloud User Guide.
    */
  var Ipv4Prefix: js.UndefOr[String] = js.undefined
}
object Ipv4PrefixSpecification {
  
  inline def apply(): Ipv4PrefixSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv4PrefixSpecification]
  }
  
  extension [Self <: Ipv4PrefixSpecification](x: Self) {
    
    inline def setIpv4Prefix(value: String): Self = StObject.set(x, "Ipv4Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixUndefined: Self = StObject.set(x, "Ipv4Prefix", js.undefined)
  }
}
