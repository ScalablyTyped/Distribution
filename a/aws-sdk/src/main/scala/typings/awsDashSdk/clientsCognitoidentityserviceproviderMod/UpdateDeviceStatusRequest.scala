package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceStatusRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  /**
    * The status of whether a device is remembered.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
}

object UpdateDeviceStatusRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    DeviceKey: DeviceKeyType,
    DeviceRememberedStatus: DeviceRememberedStatusType = null
  ): UpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, DeviceKey = DeviceKey)
    if (DeviceRememberedStatus != null) __obj.updateDynamic("DeviceRememberedStatus")(DeviceRememberedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStatusRequest]
  }
}

