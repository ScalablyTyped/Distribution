package typings.avoscloudDashSdk.avoscloudDashSdkMod.Collection

import typings.avoscloudDashSdk.avoscloudDashSdkMod.ErrorOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.SilentOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.SuccessOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions
  extends SuccessOption
     with ErrorOption
     with SilentOption
     with UseMasterKeyOption

object FetchOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

