package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceData extends js.Object {
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceName] = js.undefined
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceSerialNumber] = js.undefined
  /**
    * The status of a device.
    */
  var DeviceStatus: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceStatus] = js.undefined
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceStatusInfo] = js.undefined
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceType] = js.undefined
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MacAddress] = js.undefined
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NetworkProfileName] = js.undefined
  /**
    * The room ARN associated with a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the room associated with a device.
    */
  var RoomName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomName] = js.undefined
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SoftwareVersion] = js.undefined
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
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (DeviceSerialNumber != null) __obj.updateDynamic("DeviceSerialNumber")(DeviceSerialNumber)
    if (DeviceStatus != null) __obj.updateDynamic("DeviceStatus")(DeviceStatus.asInstanceOf[js.Any])
    if (DeviceStatusInfo != null) __obj.updateDynamic("DeviceStatusInfo")(DeviceStatusInfo)
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType)
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress)
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn)
    if (NetworkProfileName != null) __obj.updateDynamic("NetworkProfileName")(NetworkProfileName)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName)
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion)
    __obj.asInstanceOf[DeviceData]
  }
}

