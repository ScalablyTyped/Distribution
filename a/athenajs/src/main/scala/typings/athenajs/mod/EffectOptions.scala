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
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    endValue: js.UndefOr[Double] = js.undefined,
    startValue: js.UndefOr[Double] = js.undefined,
    when: String = null
  ): EffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectOptions]
  }
}

