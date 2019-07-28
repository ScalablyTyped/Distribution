package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForgetDeviceRequest extends js.Object {
  /**
    * The access token for the forgotten device request.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
}

object ForgetDeviceRequest {
  @scala.inline
  def apply(DeviceKey: DeviceKeyType, AccessToken: TokenModelType = null): ForgetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey)
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    __obj.asInstanceOf[ForgetDeviceRequest]
  }
}

