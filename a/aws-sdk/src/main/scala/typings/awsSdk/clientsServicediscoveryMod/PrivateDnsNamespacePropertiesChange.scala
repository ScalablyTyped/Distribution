package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsNamespacePropertiesChange extends StObject {
  
  /**
    * Updated DNS properties for the private DNS namespace.
    */
  var DnsProperties: PrivateDnsPropertiesMutableChange
}
object PrivateDnsNamespacePropertiesChange {
  
  inline def apply(DnsProperties: PrivateDnsPropertiesMutableChange): PrivateDnsNamespacePropertiesChange = {
    val __obj = js.Dynamic.literal(DnsProperties = DnsProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsNamespacePropertiesChange]
  }
  
  extension [Self <: PrivateDnsNamespacePropertiesChange](x: Self) {
    
    inline def setDnsProperties(value: PrivateDnsPropertiesMutableChange): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
  }
}
