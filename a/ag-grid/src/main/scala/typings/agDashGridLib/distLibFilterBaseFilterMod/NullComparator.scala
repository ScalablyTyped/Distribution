package typings
package agDashGridLib.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullComparator extends js.Object {
  @JSName("equals")
  var equals_FNullComparator: js.UndefOr[scala.Boolean] = js.undefined
  var greaterThan: js.UndefOr[scala.Boolean] = js.undefined
  var lessThan: js.UndefOr[scala.Boolean] = js.undefined
}

object NullComparator {
  @scala.inline
  def apply(
    equals: js.UndefOr[scala.Boolean] = js.undefined,
    greaterThan: js.UndefOr[scala.Boolean] = js.undefined,
    lessThan: js.UndefOr[scala.Boolean] = js.undefined
  ): NullComparator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(equals)) __obj.updateDynamic("equals")(equals)
    if (!js.isUndefined(greaterThan)) __obj.updateDynamic("greaterThan")(greaterThan)
    if (!js.isUndefined(lessThan)) __obj.updateDynamic("lessThan")(lessThan)
    __obj.asInstanceOf[NullComparator]
  }
}

