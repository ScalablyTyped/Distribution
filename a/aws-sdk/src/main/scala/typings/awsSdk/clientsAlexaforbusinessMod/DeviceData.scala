package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceData extends StObject {
  
  /**
    * The time (in epoch) when the device data was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DeviceName] = js.undefined
  
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DeviceSerialNumber] = js.undefined
  
  /**
    * The status of a device.
    */
  var DeviceStatus: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DeviceStatus] = js.undefined
  
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DeviceStatusInfo] = js.undefined
  
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DeviceType] = js.undefined
  
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MacAddress] = js.undefined
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NetworkProfileName] = js.undefined
  
  /**
    * The room ARN associated with a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the room associated with a device.
    */
  var RoomName: js.UndefOr[DeviceRoomName] = js.undefined
  
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SoftwareVersion] = js.undefined
}
object DeviceData {
  
  inline def apply(): DeviceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceData] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
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
    
    inline def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileArnUndefined: Self = StObject.set(x, "NetworkProfileArn", js.undefined)
    
    inline def setNetworkProfileName(value: NetworkProfileName): Self = StObject.set(x, "NetworkProfileName", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileNameUndefined: Self = StObject.set(x, "NetworkProfileName", js.undefined)
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setRoomName(value: DeviceRoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
    
    inline def setSoftwareVersion(value: SoftwareVersion): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
  }
}
