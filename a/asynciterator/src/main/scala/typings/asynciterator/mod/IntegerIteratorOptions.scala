package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerIteratorOptions extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object IntegerIteratorOptions {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): IntegerIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerIteratorOptions]
  }
}

