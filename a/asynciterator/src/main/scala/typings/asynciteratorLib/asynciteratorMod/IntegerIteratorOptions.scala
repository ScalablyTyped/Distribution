package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerIteratorOptions extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object IntegerIteratorOptions {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): IntegerIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerIteratorOptions]
  }
}

