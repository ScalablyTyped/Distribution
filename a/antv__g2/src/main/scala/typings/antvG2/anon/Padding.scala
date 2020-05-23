package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[X] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[X] = js.undefined
}

object Padding {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    end: X = null,
    padding: js.UndefOr[Double] = js.undefined,
    start: X = null
  ): Padding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

