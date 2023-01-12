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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateDnsNamespaceProperties] (val x: Self) extends AnyVal {
    
    inline def setDnsProperties(value: PrivateDnsPropertiesMutable): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
  }
}
