package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsServiceDiscovery extends StObject {
  
  /**
    * Specifies the DNS service discovery hostname for the virtual node. 
    */
  var hostname: Hostname
}
object DnsServiceDiscovery {
  
  @scala.inline
  def apply(hostname: Hostname): DnsServiceDiscovery = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsServiceDiscovery]
  }
  
  @scala.inline
  implicit class DnsServiceDiscoveryMutableBuilder[Self <: DnsServiceDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: Hostname): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
  }
}
