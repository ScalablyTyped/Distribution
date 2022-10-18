package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsNamespaceProperties extends StObject {
  
  /**
    * DNS properties for the private DNS namespace.
    */
  var DnsProperties: PrivateDnsPropertiesMutable
}
object PrivateDnsNamespaceProperties {
  
  inline def apply(DnsProperties: PrivateDnsPropertiesMutable): PrivateDnsNamespaceProperties = {
    val __obj = js.Dynamic.literal(DnsProperties = DnsProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsNamespaceProperties]
  }
  
  extension [Self <: PrivateDnsNamespaceProperties](x: Self) {
    
    inline def setDnsProperties(value: PrivateDnsPropertiesMutable): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
  }
}
