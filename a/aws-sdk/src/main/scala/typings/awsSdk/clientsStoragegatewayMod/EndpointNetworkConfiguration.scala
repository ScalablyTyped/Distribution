package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointNetworkConfiguration extends StObject {
  
  /**
    * A list of gateway IP addresses on which the associated Amazon FSx file system is available.  If multiple file systems are associated with this gateway, this field is required. 
    */
  var IpAddresses: js.UndefOr[IpAddressList] = js.undefined
}
object EndpointNetworkConfiguration {
  
  inline def apply(): EndpointNetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointNetworkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointNetworkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIpAddresses(value: IpAddressList): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: IPV4Address*): Self = StObject.set(x, "IpAddresses", js.Array(value*))
  }
}
