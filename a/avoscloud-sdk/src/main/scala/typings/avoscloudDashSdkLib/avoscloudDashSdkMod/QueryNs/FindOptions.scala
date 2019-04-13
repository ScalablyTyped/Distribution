package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
     with avoscloudDashSdkLib.avoscloudDashSdkMod.UseMasterKeyOption

object FindOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[FindOptions]
  }
}

