package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationType extends js.Object {
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.native
  /**
    * If true, a device is only remembered on user prompt.
    */
  var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.native
}

object DeviceConfigurationType {
  @scala.inline
  def apply(
    ChallengeRequiredOnNewDevice: js.UndefOr[Boolean] = js.undefined,
    DeviceOnlyRememberedOnUserPrompt: js.UndefOr[Boolean] = js.undefined
  ): DeviceConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ChallengeRequiredOnNewDevice)) __obj.updateDynamic("ChallengeRequiredOnNewDevice")(ChallengeRequiredOnNewDevice.asInstanceOf[js.Any])
    if (!js.isUndefined(DeviceOnlyRememberedOnUserPrompt)) __obj.updateDynamic("DeviceOnlyRememberedOnUserPrompt")(DeviceOnlyRememberedOnUserPrompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationType]
  }
}

