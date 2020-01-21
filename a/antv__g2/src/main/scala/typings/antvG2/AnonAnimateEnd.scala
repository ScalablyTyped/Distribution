package typings.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimateEnd extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[AnonX] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[AnonX] = js.undefined
}

object AnonAnimateEnd {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    end: AnonX = null,
    padding: Int | Double = null,
    start: AnonX = null
  ): AnonAnimateEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimateEnd]
  }
}

