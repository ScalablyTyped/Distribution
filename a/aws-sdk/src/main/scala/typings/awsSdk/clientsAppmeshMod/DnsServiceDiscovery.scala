package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsServiceDiscovery extends StObject {
  
  /**
    * Specifies the DNS service discovery hostname for the virtual node. 
    */
  var hostname: Hostname
  
  /**
    * The preferred IP version that this virtual node uses. Setting the IP preference on the virtual node only overrides the IP preference set for the mesh on this specific node.
    */
  var ipPreference: js.UndefOr[IpPreference] = js.undefined
  
  /**
    * Specifies the DNS response type for the virtual node.
    */
  var responseType: js.UndefOr[DnsResponseType] = js.undefined
}
object DnsServiceDiscovery {
  
  inline def apply(hostname: Hostname): DnsServiceDiscovery = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsServiceDiscovery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsServiceDiscovery] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: Hostname): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setIpPreference(value: IpPreference): Self = StObject.set(x, "ipPreference", value.asInstanceOf[js.Any])
    
    inline def setIpPreferenceUndefined: Self = StObject.set(x, "ipPreference", js.undefined)
    
    inline def setResponseType(value: DnsResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
