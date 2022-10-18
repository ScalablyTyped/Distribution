package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketAddress extends StObject {
  
  /**
    * The IP address for the socket address.
    */
  var IpAddress: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The port for the socket address.
    */
  var Port: js.UndefOr[PortNumber] = js.undefined
}
object SocketAddress {
  
  inline def apply(): SocketAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketAddress]
  }
  
  extension [Self <: SocketAddress](x: Self) {
    
    inline def setIpAddress(value: GenericString): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setPort(value: PortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
