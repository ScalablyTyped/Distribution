package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceName] = js.undefined
  
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceSerialNumber] = js.undefined
  
  /**
    * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
    */
  var DeviceStatus: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatus] = js.undefined
  
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatusInfo] = js.undefined
  
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceType] = js.undefined
  
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MacAddress] = js.undefined
  
  /**
    * Detailed information about a device's network profile.
    */
  var NetworkProfileInfo: js.UndefOr[DeviceNetworkProfileInfo] = js.undefined
  
  /**
    * The room ARN of a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SoftwareVersion] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setDeviceSerialNumber(value: DeviceSerialNumber): Self = StObject.set(x, "DeviceSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setDeviceSerialNumberUndefined: Self = StObject.set(x, "DeviceSerialNumber", js.undefined)
    
    inline def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "DeviceStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusInfo(value: DeviceStatusInfo): Self = StObject.set(x, "DeviceStatusInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusInfoUndefined: Self = StObject.set(x, "DeviceStatusInfo", js.undefined)
    
    inline def setDeviceStatusUndefined: Self = StObject.set(x, "DeviceStatus", js.undefined)
    
    inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    inline def setMacAddress(value: MacAddress): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    inline def setNetworkProfileInfo(value: DeviceNetworkProfileInfo): Self = StObject.set(x, "NetworkProfileInfo", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileInfoUndefined: Self = StObject.set(x, "NetworkProfileInfo", js.undefined)
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setSoftwareVersion(value: SoftwareVersion): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
  }
}
