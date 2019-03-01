package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 屏幕亮度 https://docs.alipay.com/mini/api/screen-brightness
trait SetKeepScreenOnOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否保持屏幕常亮 */
  var keepScreenOn: scala.Boolean
  @JSName("success")
  var success_SetKeepScreenOnOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_ErrMsg, scala.Unit]] = js.undefined
}

object SetKeepScreenOnOptions {
  @scala.inline
  def apply(
    keepScreenOn: scala.Boolean,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_ErrMsg, scala.Unit] = null
  ): SetKeepScreenOnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keepScreenOn")(keepScreenOn)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetKeepScreenOnOptions]
  }
}

