package typings.atAntvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimateEnd extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Anon_X] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Anon_X] = js.undefined
}

object Anon_AnimateEnd {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    end: Anon_X = null,
    padding: Int | Double = null,
    start: Anon_X = null
  ): Anon_AnimateEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimateEnd]
  }
}

