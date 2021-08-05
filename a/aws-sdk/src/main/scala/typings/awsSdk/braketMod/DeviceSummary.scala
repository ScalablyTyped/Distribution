package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSummary extends StObject {
  
  /**
    * The ARN of the device.
    */
  var deviceArn: DeviceArn
  
  /**
    * The name of the device.
    */
  var deviceName: String
  
  /**
    * The status of the device.
    */
  var deviceStatus: DeviceStatus
  
  /**
    * The type of the device.
    */
  var deviceType: DeviceType
  
  /**
    * The provider of the device.
    */
  var providerName: String
}
object DeviceSummary {
  
  inline def apply(
    deviceArn: DeviceArn,
    deviceName: String,
    deviceStatus: DeviceStatus,
    deviceType: DeviceType,
    providerName: String
  ): DeviceSummary = {
    val __obj = js.Dynamic.literal(deviceArn = deviceArn.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], deviceStatus = deviceStatus.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSummary]
  }
  
  extension [Self <: DeviceSummary](x: Self) {
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "deviceStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
