package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANUpdateDevice extends StObject {
  
  /**
    * ABP device object for update APIs for v1.0.x
    */
  var AbpV1_0_x: js.UndefOr[UpdateAbpV10X] = js.undefined
  
  /**
    * ABP device object for update APIs for v1.1
    */
  var AbpV1_1: js.UndefOr[UpdateAbpV11] = js.undefined
  
  /**
    * The ID of the device profile for the wireless device.
    */
  var DeviceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileId] = js.undefined
  
  /**
    * FPorts object for the positioning information of the device.
    */
  var FPorts: js.UndefOr[UpdateFPorts] = js.undefined
  
  /**
    * The ID of the service profile.
    */
  var ServiceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ServiceProfileId] = js.undefined
}
object LoRaWANUpdateDevice {
  
  inline def apply(): LoRaWANUpdateDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANUpdateDevice]
  }
  
  extension [Self <: LoRaWANUpdateDevice](x: Self) {
    
    inline def setAbpV1_0_x(value: UpdateAbpV10X): Self = StObject.set(x, "AbpV1_0_x", value.asInstanceOf[js.Any])
    
    inline def setAbpV1_0_xUndefined: Self = StObject.set(x, "AbpV1_0_x", js.undefined)
    
    inline def setAbpV1_1(value: UpdateAbpV11): Self = StObject.set(x, "AbpV1_1", value.asInstanceOf[js.Any])
    
    inline def setAbpV1_1Undefined: Self = StObject.set(x, "AbpV1_1", js.undefined)
    
    inline def setDeviceProfileId(value: DeviceProfileId): Self = StObject.set(x, "DeviceProfileId", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileIdUndefined: Self = StObject.set(x, "DeviceProfileId", js.undefined)
    
    inline def setFPorts(value: UpdateFPorts): Self = StObject.set(x, "FPorts", value.asInstanceOf[js.Any])
    
    inline def setFPortsUndefined: Self = StObject.set(x, "FPorts", js.undefined)
    
    inline def setServiceProfileId(value: ServiceProfileId): Self = StObject.set(x, "ServiceProfileId", value.asInstanceOf[js.Any])
    
    inline def setServiceProfileIdUndefined: Self = StObject.set(x, "ServiceProfileId", js.undefined)
  }
}
