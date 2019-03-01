package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstOptions
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.SuccessFailureOptions
     with avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.UseMasterKeyOption

object FirstOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): FirstOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[FirstOptions]
  }
}

