package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewDeviceMetadataType extends js.Object {
  /**
    * The device group key.
    */
  var DeviceGroupKey: js.UndefOr[StringType] = js.undefined
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
}

object NewDeviceMetadataType {
  @scala.inline
  def apply(DeviceGroupKey: StringType = null, DeviceKey: DeviceKeyType = null): NewDeviceMetadataType = {
    val __obj = js.Dynamic.literal()
    if (DeviceGroupKey != null) __obj.updateDynamic("DeviceGroupKey")(DeviceGroupKey)
    if (DeviceKey != null) __obj.updateDynamic("DeviceKey")(DeviceKey)
    __obj.asInstanceOf[NewDeviceMetadataType]
  }
}

