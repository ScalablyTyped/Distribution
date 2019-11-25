package typings.agDashGrid.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullComparator extends js.Object {
  @JSName("equals")
  var equals_FNullComparator: js.UndefOr[Boolean] = js.undefined
  var greaterThan: js.UndefOr[Boolean] = js.undefined
  var lessThan: js.UndefOr[Boolean] = js.undefined
}

object NullComparator {
  @scala.inline
  def apply(
    equals: js.UndefOr[Boolean] = js.undefined,
    greaterThan: js.UndefOr[Boolean] = js.undefined,
    lessThan: js.UndefOr[Boolean] = js.undefined
  ): NullComparator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(equals)) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (!js.isUndefined(greaterThan)) __obj.updateDynamic("greaterThan")(greaterThan.asInstanceOf[js.Any])
    if (!js.isUndefined(lessThan)) __obj.updateDynamic("lessThan")(lessThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullComparator]
  }
}

