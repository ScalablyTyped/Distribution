package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.PushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  var error: js.UndefOr[
    js.Function1[/* error */ avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Error, scala.Unit]
  ] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    error: /* error */ avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Error => scala.Unit = null,
    success: () => scala.Unit = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SendOptions]
  }
}

