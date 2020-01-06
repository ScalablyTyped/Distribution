package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceStatusRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  /**
    * The status of whether a device is remembered.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.native
}

object UpdateDeviceStatusRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    DeviceKey: DeviceKeyType,
    DeviceRememberedStatus: DeviceRememberedStatusType = null
  ): UpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    if (DeviceRememberedStatus != null) __obj.updateDynamic("DeviceRememberedStatus")(DeviceRememberedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStatusRequest]
  }
}

