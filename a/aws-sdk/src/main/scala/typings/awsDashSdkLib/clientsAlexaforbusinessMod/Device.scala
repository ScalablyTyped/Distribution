package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[DeviceName] = js.undefined
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined
  /**
    * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
    */
  var DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[DeviceStatusInfo] = js.undefined
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[DeviceType] = js.undefined
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[MacAddress] = js.undefined
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
  var SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    DeviceArn: Arn = null,
    DeviceName: DeviceName = null,
    DeviceSerialNumber: DeviceSerialNumber = null,
    DeviceStatus: DeviceStatus = null,
    DeviceStatusInfo: DeviceStatusInfo = null,
    DeviceType: DeviceType = null,
    MacAddress: MacAddress = null,
    NetworkProfileInfo: DeviceNetworkProfileInfo = null,
    RoomArn: Arn = null,
    SoftwareVersion: SoftwareVersion = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (DeviceSerialNumber != null) __obj.updateDynamic("DeviceSerialNumber")(DeviceSerialNumber)
    if (DeviceStatus != null) __obj.updateDynamic("DeviceStatus")(DeviceStatus.asInstanceOf[js.Any])
    if (DeviceStatusInfo != null) __obj.updateDynamic("DeviceStatusInfo")(DeviceStatusInfo)
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType)
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress)
    if (NetworkProfileInfo != null) __obj.updateDynamic("NetworkProfileInfo")(NetworkProfileInfo)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion)
    __obj.asInstanceOf[Device]
  }
}

