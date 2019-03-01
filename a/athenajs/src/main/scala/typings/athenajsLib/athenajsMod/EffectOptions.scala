package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var endValue: js.UndefOr[scala.Double] = js.undefined
  var startValue: js.UndefOr[scala.Double] = js.undefined
  var when: js.UndefOr[java.lang.String] = js.undefined
}

object EffectOptions {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    endValue: scala.Int | scala.Double = null,
    startValue: scala.Int | scala.Double = null,
    when: java.lang.String = null
  ): EffectOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[EffectOptions]
  }
}

