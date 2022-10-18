package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkDeviceMetadata extends StObject {
  
  /**
    * Sidewalk device battery level.
    */
  var BatteryLevel: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.BatteryLevel] = js.undefined
  
  /**
    * Device state defines the device status of sidewalk device.
    */
  var DeviceState: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceState] = js.undefined
  
  /**
    * Sidewalk device status notification.
    */
  var Event: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Event] = js.undefined
  
  /**
    * The RSSI value.
    */
  var Rssi: js.UndefOr[Integer] = js.undefined
}
object SidewalkDeviceMetadata {
  
  inline def apply(): SidewalkDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkDeviceMetadata]
  }
  
  extension [Self <: SidewalkDeviceMetadata](x: Self) {
    
    inline def setBatteryLevel(value: BatteryLevel): Self = StObject.set(x, "BatteryLevel", value.asInstanceOf[js.Any])
    
    inline def setBatteryLevelUndefined: Self = StObject.set(x, "BatteryLevel", js.undefined)
    
    inline def setDeviceState(value: DeviceState): Self = StObject.set(x, "DeviceState", value.asInstanceOf[js.Any])
    
    inline def setDeviceStateUndefined: Self = StObject.set(x, "DeviceState", js.undefined)
    
    inline def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
    
    inline def setRssi(value: Integer): Self = StObject.set(x, "Rssi", value.asInstanceOf[js.Any])
    
    inline def setRssiUndefined: Self = StObject.set(x, "Rssi", js.undefined)
  }
}
