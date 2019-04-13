package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
     with avoscloudDashSdkLib.avoscloudDashSdkMod.WaitOption
     with avoscloudDashSdkLib.avoscloudDashSdkMod.UseMasterKeyOption

object DestroyOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[DestroyOptions]
  }
}

