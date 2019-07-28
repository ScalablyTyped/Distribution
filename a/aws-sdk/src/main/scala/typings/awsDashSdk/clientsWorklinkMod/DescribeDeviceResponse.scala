package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeviceResponse extends js.Object {
  /**
    * The date that the device first signed in to Amazon WorkLink.
    */
  var FirstAccessedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The date that the device last accessed Amazon WorkLink.
    */
  var LastAccessedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The manufacturer of the device.
    */
  var Manufacturer: js.UndefOr[DeviceManufacturer] = js.undefined
  /**
    * The model of the device.
    */
  var Model: js.UndefOr[DeviceModel] = js.undefined
  /**
    * The operating system of the device.
    */
  var OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.undefined
  /**
    * The operating system version of the device.
    */
  var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.undefined
  /**
    * The operating system patch level of the device.
    */
  var PatchLevel: js.UndefOr[DevicePatchLevel] = js.undefined
  /**
    * The current state of the device.
    */
  var Status: js.UndefOr[DeviceStatus] = js.undefined
  /**
    * The user name associated with the device.
    */
  var Username: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.Username] = js.undefined
}

object DescribeDeviceResponse {
  @scala.inline
  def apply(
    FirstAccessedTime: DateTime = null,
    LastAccessedTime: DateTime = null,
    Manufacturer: DeviceManufacturer = null,
    Model: DeviceModel = null,
    OperatingSystem: DeviceOperatingSystemName = null,
    OperatingSystemVersion: DeviceOperatingSystemVersion = null,
    PatchLevel: DevicePatchLevel = null,
    Status: DeviceStatus = null,
    Username: Username = null
  ): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (FirstAccessedTime != null) __obj.updateDynamic("FirstAccessedTime")(FirstAccessedTime)
    if (LastAccessedTime != null) __obj.updateDynamic("LastAccessedTime")(LastAccessedTime)
    if (Manufacturer != null) __obj.updateDynamic("Manufacturer")(Manufacturer)
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem)
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion)
    if (PatchLevel != null) __obj.updateDynamic("PatchLevel")(PatchLevel)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
}

