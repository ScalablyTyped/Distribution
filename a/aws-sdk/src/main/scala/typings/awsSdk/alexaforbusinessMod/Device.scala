package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
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
    * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
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
    * Detailed information about a device's network profile.
    */
  var NetworkProfileInfo: js.UndefOr[DeviceNetworkProfileInfo] = js.native
  
  /**
    * The room ARN of a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SoftwareVersion] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceArn: Self = this.set("DeviceArn", js.undefined)
    
    @scala.inline
    def setDeviceName(value: DeviceName): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    
    @scala.inline
    def setDeviceSerialNumber(value: DeviceSerialNumber): Self = this.set("DeviceSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSerialNumber: Self = this.set("DeviceSerialNumber", js.undefined)
    
    @scala.inline
    def setDeviceStatus(value: DeviceStatus): Self = this.set("DeviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatus: Self = this.set("DeviceStatus", js.undefined)
    
    @scala.inline
    def setDeviceStatusInfo(value: DeviceStatusInfo): Self = this.set("DeviceStatusInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatusInfo: Self = this.set("DeviceStatusInfo", js.undefined)
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = this.set("DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("DeviceType", js.undefined)
    
    @scala.inline
    def setMacAddress(value: MacAddress): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkProfileInfo(value: DeviceNetworkProfileInfo): Self = this.set("NetworkProfileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfileInfo: Self = this.set("NetworkProfileInfo", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: SoftwareVersion): Self = this.set("SoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareVersion: Self = this.set("SoftwareVersion", js.undefined)
  }
}
