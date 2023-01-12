package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDeviceNetworkSettings extends StObject {
  
  /**
    * The DNS addresses of the input device.
    */
  var DnsAddresses: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The network gateway IP address.
    */
  var Gateway: js.UndefOr[string] = js.undefined
  
  /**
    * The IP address of the input device.
    */
  var IpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
    */
  var IpScheme: js.UndefOr[InputDeviceIpScheme] = js.undefined
  
  /**
    * The subnet mask of the input device.
    */
  var SubnetMask: js.UndefOr[string] = js.undefined
}
object InputDeviceNetworkSettings {
  
  inline def apply(): InputDeviceNetworkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceNetworkSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDeviceNetworkSettings] (val x: Self) extends AnyVal {
    
    inline def setDnsAddresses(value: listOfString): Self = StObject.set(x, "DnsAddresses", value.asInstanceOf[js.Any])
    
    inline def setDnsAddressesUndefined: Self = StObject.set(x, "DnsAddresses", js.undefined)
    
    inline def setDnsAddressesVarargs(value: string*): Self = StObject.set(x, "DnsAddresses", js.Array(value*))
    
    inline def setGateway(value: string): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
    
    inline def setIpAddress(value: string): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setIpScheme(value: InputDeviceIpScheme): Self = StObject.set(x, "IpScheme", value.asInstanceOf[js.Any])
    
    inline def setIpSchemeUndefined: Self = StObject.set(x, "IpScheme", js.undefined)
    
    inline def setSubnetMask(value: string): Self = StObject.set(x, "SubnetMask", value.asInstanceOf[js.Any])
    
    inline def setSubnetMaskUndefined: Self = StObject.set(x, "SubnetMask", js.undefined)
  }
}
