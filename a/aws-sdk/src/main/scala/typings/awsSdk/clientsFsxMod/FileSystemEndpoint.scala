package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemEndpoint extends StObject {
  
  var DNSName: js.UndefOr[typings.awsSdk.clientsFsxMod.DNSName] = js.undefined
  
  /**
    * IP addresses of the file system endpoint.
    */
  var IpAddresses: js.UndefOr[OntapEndpointIpAddresses] = js.undefined
}
object FileSystemEndpoint {
  
  inline def apply(): FileSystemEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemEndpoint]
  }
  
  extension [Self <: FileSystemEndpoint](x: Self) {
    
    inline def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    inline def setIpAddresses(value: OntapEndpointIpAddresses): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "IpAddresses", js.Array(value*))
  }
}
