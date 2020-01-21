package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var endValue: js.UndefOr[Double] = js.undefined
  var startValue: js.UndefOr[Double] = js.undefined
  var when: js.UndefOr[String] = js.undefined
}

object EffectOptions {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    easing: String = null,
    endValue: Int | Double = null,
    startValue: Int | Double = null,
    when: String = null
  ): EffectOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectOptions]
  }
}

