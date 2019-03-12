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
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(brightness = brightness)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
}

