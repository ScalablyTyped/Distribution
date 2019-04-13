package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
}

object GetDeviceRequest {
  @scala.inline
  def apply(DeviceKey: DeviceKeyType, AccessToken: TokenModelType = null): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey)
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    __obj.asInstanceOf[GetDeviceRequest]
  }
}

