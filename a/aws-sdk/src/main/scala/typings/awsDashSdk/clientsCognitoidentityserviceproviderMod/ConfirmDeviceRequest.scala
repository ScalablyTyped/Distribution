package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmDeviceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[DeviceNameType] = js.native
  /**
    * The configuration of the device secret verifier.
    */
  var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.native
}

object ConfirmDeviceRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    DeviceKey: DeviceKeyType,
    DeviceName: DeviceNameType = null,
    DeviceSecretVerifierConfig: DeviceSecretVerifierConfigType = null
  ): ConfirmDeviceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (DeviceSecretVerifierConfig != null) __obj.updateDynamic("DeviceSecretVerifierConfig")(DeviceSecretVerifierConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDeviceRequest]
  }
}

