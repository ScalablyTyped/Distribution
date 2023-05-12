package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterWirelessDeviceRequest extends StObject {
  
  /**
    * The identifier of the wireless device to deregister from AWS IoT Wireless.
    */
  var Identifier: typings.awsSdk.clientsIotwirelessMod.Identifier
  
  /**
    * The type of wireless device to deregister from AWS IoT Wireless, which can be LoRaWAN or Sidewalk.
    */
  var WirelessDeviceType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WirelessDeviceType] = js.undefined
}
object DeregisterWirelessDeviceRequest {
  
  inline def apply(Identifier: Identifier): DeregisterWirelessDeviceRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterWirelessDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterWirelessDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceType(value: WirelessDeviceType): Self = StObject.set(x, "WirelessDeviceType", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceTypeUndefined: Self = StObject.set(x, "WirelessDeviceType", js.undefined)
  }
}
