package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmDeviceResponse extends js.Object {
  /**
    * Indicates whether the user confirmation is necessary to confirm the device response.
    */
  var UserConfirmationNecessary: js.UndefOr[BooleanType] = js.undefined
}

object ConfirmDeviceResponse {
  @scala.inline
  def apply(UserConfirmationNecessary: js.UndefOr[Boolean] = js.undefined): ConfirmDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(UserConfirmationNecessary)) __obj.updateDynamic("UserConfirmationNecessary")(UserConfirmationNecessary)
    __obj.asInstanceOf[ConfirmDeviceResponse]
  }
}

