package typings.avoscloudDashSdk.avoscloudDashSdkMod.Collection

import typings.avoscloudDashSdk.avoscloudDashSdkMod.ErrorOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.SilentOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.SuccessOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.UseMasterKeyOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with SilentOption
     with UseMasterKeyOption

object CreateOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[CreateOptions]
  }
}

