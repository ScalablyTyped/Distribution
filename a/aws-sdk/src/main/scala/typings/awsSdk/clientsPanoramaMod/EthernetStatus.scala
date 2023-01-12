package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthernetStatus extends StObject {
  
  /**
    * The device's connection status.
    */
  var ConnectionStatus: js.UndefOr[NetworkConnectionStatus] = js.undefined
  
  /**
    * The device's physical address.
    */
  var HwAddress: js.UndefOr[typings.awsSdk.clientsPanoramaMod.HwAddress] = js.undefined
  
  /**
    * The device's IP address.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsPanoramaMod.IpAddress] = js.undefined
}
object EthernetStatus {
  
  inline def apply(): EthernetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EthernetStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthernetStatus] (val x: Self) extends AnyVal {
    
    inline def setConnectionStatus(value: NetworkConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setHwAddress(value: HwAddress): Self = StObject.set(x, "HwAddress", value.asInstanceOf[js.Any])
    
    inline def setHwAddressUndefined: Self = StObject.set(x, "HwAddress", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
  }
}
