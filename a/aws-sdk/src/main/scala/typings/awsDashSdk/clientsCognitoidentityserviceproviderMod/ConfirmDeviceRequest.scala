package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmDeviceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[DeviceNameType] = js.undefined
  /**
    * The configuration of the device secret verifier.
    */
  var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.undefined
}

object ConfirmDeviceRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    DeviceKey: DeviceKeyType,
    DeviceName: DeviceNameType = null,
    DeviceSecretVerifierConfig: DeviceSecretVerifierConfigType = null
  ): ConfirmDeviceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, DeviceKey = DeviceKey)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (DeviceSecretVerifierConfig != null) __obj.updateDynamic("DeviceSecretVerifierConfig")(DeviceSecretVerifierConfig)
    __obj.asInstanceOf[ConfirmDeviceRequest]
  }
}

