package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminUpdateDeviceStatusRequest extends js.Object {
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  /**
    * The status indicating whether a device has been remembered or not.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name.
    */
  var Username: UsernameType
}

object AdminUpdateDeviceStatusRequest {
  @scala.inline
  def apply(
    DeviceKey: DeviceKeyType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    DeviceRememberedStatus: DeviceRememberedStatusType = null
  ): AdminUpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey, UserPoolId = UserPoolId, Username = Username)
    if (DeviceRememberedStatus != null) __obj.updateDynamic("DeviceRememberedStatus")(DeviceRememberedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUpdateDeviceStatusRequest]
  }
}

