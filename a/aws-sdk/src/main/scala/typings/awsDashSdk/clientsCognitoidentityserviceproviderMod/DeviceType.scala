package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceType extends js.Object {
  /**
    * The device attributes.
    */
  var DeviceAttributes: js.UndefOr[AttributeListType] = js.undefined
  /**
    * The creation date of the device.
    */
  var DeviceCreateDate: js.UndefOr[DateType] = js.undefined
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
  /**
    * The date in which the device was last authenticated.
    */
  var DeviceLastAuthenticatedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The last modified date of the device.
    */
  var DeviceLastModifiedDate: js.UndefOr[DateType] = js.undefined
}

object DeviceType {
  @scala.inline
  def apply(
    DeviceAttributes: AttributeListType = null,
    DeviceCreateDate: DateType = null,
    DeviceKey: DeviceKeyType = null,
    DeviceLastAuthenticatedDate: DateType = null,
    DeviceLastModifiedDate: DateType = null
  ): DeviceType = {
    val __obj = js.Dynamic.literal()
    if (DeviceAttributes != null) __obj.updateDynamic("DeviceAttributes")(DeviceAttributes)
    if (DeviceCreateDate != null) __obj.updateDynamic("DeviceCreateDate")(DeviceCreateDate)
    if (DeviceKey != null) __obj.updateDynamic("DeviceKey")(DeviceKey)
    if (DeviceLastAuthenticatedDate != null) __obj.updateDynamic("DeviceLastAuthenticatedDate")(DeviceLastAuthenticatedDate)
    if (DeviceLastModifiedDate != null) __obj.updateDynamic("DeviceLastModifiedDate")(DeviceLastModifiedDate)
    __obj.asInstanceOf[DeviceType]
  }
}

