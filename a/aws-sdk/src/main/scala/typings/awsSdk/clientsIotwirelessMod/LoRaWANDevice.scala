package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANDevice extends StObject {
  
  /**
    * LoRaWAN object for create APIs
    */
  var AbpV1_0_x: js.UndefOr[AbpV10X] = js.undefined
  
  /**
    * ABP device object for create APIs for v1.1
    */
  var AbpV1_1: js.UndefOr[AbpV11] = js.undefined
  
  /**
    * The DevEUI value.
    */
  var DevEui: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DevEui] = js.undefined
  
  /**
    * The ID of the device profile for the new wireless device.
    */
  var DeviceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileId] = js.undefined
  
  var FPorts: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FPorts] = js.undefined
  
  /**
    * OTAA device object for create APIs for v1.0.x
    */
  var OtaaV1_0_x: js.UndefOr[OtaaV10X] = js.undefined
  
  /**
    * OTAA device object for v1.1 for create APIs
    */
  var OtaaV1_1: js.UndefOr[OtaaV11] = js.undefined
  
  /**
    * The ID of the service profile.
    */
  var ServiceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ServiceProfileId] = js.undefined
}
object LoRaWANDevice {
  
  inline def apply(): LoRaWANDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANDevice] (val x: Self) extends AnyVal {
    
    inline def setAbpV1_0_x(value: AbpV10X): Self = StObject.set(x, "AbpV1_0_x", value.asInstanceOf[js.Any])
    
    inline def setAbpV1_0_xUndefined: Self = StObject.set(x, "AbpV1_0_x", js.undefined)
    
    inline def setAbpV1_1(value: AbpV11): Self = StObject.set(x, "AbpV1_1", value.asInstanceOf[js.Any])
    
    inline def setAbpV1_1Undefined: Self = StObject.set(x, "AbpV1_1", js.undefined)
    
    inline def setDevEui(value: DevEui): Self = StObject.set(x, "DevEui", value.asInstanceOf[js.Any])
    
    inline def setDevEuiUndefined: Self = StObject.set(x, "DevEui", js.undefined)
    
    inline def setDeviceProfileId(value: DeviceProfileId): Self = StObject.set(x, "DeviceProfileId", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileIdUndefined: Self = StObject.set(x, "DeviceProfileId", js.undefined)
    
    inline def setFPorts(value: FPorts): Self = StObject.set(x, "FPorts", value.asInstanceOf[js.Any])
    
    inline def setFPortsUndefined: Self = StObject.set(x, "FPorts", js.undefined)
    
    inline def setOtaaV1_0_x(value: OtaaV10X): Self = StObject.set(x, "OtaaV1_0_x", value.asInstanceOf[js.Any])
    
    inline def setOtaaV1_0_xUndefined: Self = StObject.set(x, "OtaaV1_0_x", js.undefined)
    
    inline def setOtaaV1_1(value: OtaaV11): Self = StObject.set(x, "OtaaV1_1", value.asInstanceOf[js.Any])
    
    inline def setOtaaV1_1Undefined: Self = StObject.set(x, "OtaaV1_1", js.undefined)
    
    inline def setServiceProfileId(value: ServiceProfileId): Self = StObject.set(x, "ServiceProfileId", value.asInstanceOf[js.Any])
    
    inline def setServiceProfileIdUndefined: Self = StObject.set(x, "ServiceProfileId", js.undefined)
  }
}
