package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceResponse extends StObject {
  
  /**
    * The ARN of the device.
    */
  var deviceArn: DeviceArn
  
  /**
    * Details about the capabilities of the device.
    */
  var deviceCapabilities: JsonValue
  
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
    * The name of the partner company for the device.
    */
  var providerName: String
}
object GetDeviceResponse {
  
  inline def apply(
    deviceArn: DeviceArn,
    deviceCapabilities: JsonValue,
    deviceName: String,
    deviceStatus: DeviceStatus,
    deviceType: DeviceType,
    providerName: String
  ): GetDeviceResponse = {
    val __obj = js.Dynamic.literal(deviceArn = deviceArn.asInstanceOf[js.Any], deviceCapabilities = deviceCapabilities.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], deviceStatus = deviceStatus.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceResponse]
  }
  
  extension [Self <: GetDeviceResponse](x: Self) {
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceCapabilities(value: JsonValue): Self = StObject.set(x, "deviceCapabilities", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "deviceStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
