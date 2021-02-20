package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceData extends StObject {
  
  /**
    * The time (in epoch) when the device data was created.
    */
  var CreatedTime: js.UndefOr[DeviceDataCreatedTime] = js.native
  
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceName] = js.native
  
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceSerialNumber] = js.native
  
  /**
    * The status of a device.
    */
  var DeviceStatus: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatus] = js.native
  
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatusInfo] = js.native
  
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceType] = js.native
  
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MacAddress] = js.native
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NetworkProfileName] = js.native
  
  /**
    * The room ARN associated with a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the room associated with a device.
    */
  var RoomName: js.UndefOr[DeviceRoomName] = js.native
  
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SoftwareVersion] = js.native
}
object DeviceData {
  
  @scala.inline
  def apply(): DeviceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceData]
  }
  
  @scala.inline
  implicit class DeviceDataMutableBuilder[Self <: DeviceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: DeviceDataCreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    @scala.inline
    def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setDeviceSerialNumber(value: DeviceSerialNumber): Self = StObject.set(x, "DeviceSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSerialNumberUndefined: Self = StObject.set(x, "DeviceSerialNumber", js.undefined)
    
    @scala.inline
    def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "DeviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusInfo(value: DeviceStatusInfo): Self = StObject.set(x, "DeviceStatusInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusInfoUndefined: Self = StObject.set(x, "DeviceStatusInfo", js.undefined)
    
    @scala.inline
    def setDeviceStatusUndefined: Self = StObject.set(x, "DeviceStatus", js.undefined)
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    @scala.inline
    def setMacAddress(value: MacAddress): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileArnUndefined: Self = StObject.set(x, "NetworkProfileArn", js.undefined)
    
    @scala.inline
    def setNetworkProfileName(value: NetworkProfileName): Self = StObject.set(x, "NetworkProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileNameUndefined: Self = StObject.set(x, "NetworkProfileName", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setRoomName(value: DeviceRoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: SoftwareVersion): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
  }
}
