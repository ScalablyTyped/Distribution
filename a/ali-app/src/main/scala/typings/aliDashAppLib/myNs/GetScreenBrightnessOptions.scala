package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  @JSName("success")
  def success_MGetScreenBrightnessOptions(value: scala.Double): scala.Unit
}

object GetScreenBrightnessOptions {
  @scala.inline
  def apply(
    success: js.Function1[scala.Double, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetScreenBrightnessOptions]
  }
}

