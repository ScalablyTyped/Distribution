package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceProperties extends StObject {
  
  /**
    * A complex type that contains the ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
    */
  var DnsProperties: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.DnsProperties] = js.undefined
  
  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  var HttpProperties: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.HttpProperties] = js.undefined
}
object NamespaceProperties {
  
  inline def apply(): NamespaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceProperties]
  }
  
  extension [Self <: NamespaceProperties](x: Self) {
    
    inline def setDnsProperties(value: DnsProperties): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
    
    inline def setDnsPropertiesUndefined: Self = StObject.set(x, "DnsProperties", js.undefined)
    
    inline def setHttpProperties(value: HttpProperties): Self = StObject.set(x, "HttpProperties", value.asInstanceOf[js.Any])
    
    inline def setHttpPropertiesUndefined: Self = StObject.set(x, "HttpProperties", js.undefined)
  }
}
