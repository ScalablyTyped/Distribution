package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceData extends js.Object {
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceName] = js.native
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceSerialNumber] = js.native
  /**
    * The status of a device.
    */
  var DeviceStatus: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceStatus] = js.native
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceStatusInfo] = js.native
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceType] = js.native
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MacAddress] = js.native
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NetworkProfileName] = js.native
  /**
    * The room ARN associated with a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the room associated with a device.
    */
  var RoomName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomName] = js.native
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SoftwareVersion] = js.native
}

object DeviceData {
  @scala.inline
  def apply(
    DeviceArn: Arn = null,
    DeviceName: DeviceName = null,
    DeviceSerialNumber: DeviceSerialNumber = null,
    DeviceStatus: DeviceStatus = null,
    DeviceStatusInfo: DeviceStatusInfo = null,
    DeviceType: DeviceType = null,
    MacAddress: MacAddress = null,
    NetworkProfileArn: Arn = null,
    NetworkProfileName: NetworkProfileName = null,
    RoomArn: Arn = null,
    RoomName: RoomName = null,
    SoftwareVersion: SoftwareVersion = null
  ): DeviceData = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (DeviceSerialNumber != null) __obj.updateDynamic("DeviceSerialNumber")(DeviceSerialNumber.asInstanceOf[js.Any])
    if (DeviceStatus != null) __obj.updateDynamic("DeviceStatus")(DeviceStatus.asInstanceOf[js.Any])
    if (DeviceStatusInfo != null) __obj.updateDynamic("DeviceStatusInfo")(DeviceStatusInfo.asInstanceOf[js.Any])
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn.asInstanceOf[js.Any])
    if (NetworkProfileName != null) __obj.updateDynamic("NetworkProfileName")(NetworkProfileName.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName.asInstanceOf[js.Any])
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceData]
  }
}

