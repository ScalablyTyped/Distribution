package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminUpdateDeviceStatusRequest extends js.Object {
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  /**
    * The status indicating whether a device has been remembered or not.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name.
    */
  var Username: UsernameType = js.native
}

object AdminUpdateDeviceStatusRequest {
  @scala.inline
  def apply(
    DeviceKey: DeviceKeyType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    DeviceRememberedStatus: DeviceRememberedStatusType = null
  ): AdminUpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (DeviceRememberedStatus != null) __obj.updateDynamic("DeviceRememberedStatus")(DeviceRememberedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUpdateDeviceStatusRequest]
  }
}

