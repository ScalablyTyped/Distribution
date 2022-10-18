package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDnsNamespacePropertiesChange extends StObject {
  
  /**
    * Updated DNS properties for the hosted zone for the public DNS namespace.
    */
  var DnsProperties: PublicDnsPropertiesMutableChange
}
object PublicDnsNamespacePropertiesChange {
  
  inline def apply(DnsProperties: PublicDnsPropertiesMutableChange): PublicDnsNamespacePropertiesChange = {
    val __obj = js.Dynamic.literal(DnsProperties = DnsProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicDnsNamespacePropertiesChange]
  }
  
  extension [Self <: PublicDnsNamespacePropertiesChange](x: Self) {
    
    inline def setDnsProperties(value: PublicDnsPropertiesMutableChange): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
  }
}
