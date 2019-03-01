package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要设置的屏幕亮度，取值范围0-1 */
  var brightness: scala.Double
}

object SetScreenBrightnessOptions {
  @scala.inline
  def apply(
    brightness: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brightness")(brightness)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
}

