package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceResponse extends StObject {
  
  /**
    * The ARN of the device.
    */
  var deviceArn: DeviceArn = js.native
  
  /**
    * Details about the capabilities of the device.
    */
  var deviceCapabilities: JsonValue = js.native
  
  /**
    * The name of the device.
    */
  var deviceName: String = js.native
  
  /**
    * The status of the device.
    */
  var deviceStatus: DeviceStatus = js.native
  
  /**
    * The type of the device.
    */
  var deviceType: DeviceType = js.native
  
  /**
    * The name of the partner company for the device.
    */
  var providerName: String = js.native
}
object GetDeviceResponse {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GetDeviceResponseMutableBuilder[Self <: GetDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCapabilities(value: JsonValue): Self = StObject.set(x, "deviceCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "deviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
