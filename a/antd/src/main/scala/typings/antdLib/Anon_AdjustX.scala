package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustX extends js.Object {
  var adjustX: js.UndefOr[scala.Boolean] = js.undefined
  var adjustY: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AdjustX {
  @scala.inline
  def apply(
    adjustX: js.UndefOr[scala.Boolean] = js.undefined,
    adjustY: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AdjustX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustX)) __obj.updateDynamic("adjustX")(adjustX)
    if (!js.isUndefined(adjustY)) __obj.updateDynamic("adjustY")(adjustY)
    __obj.asInstanceOf[Anon_AdjustX]
  }
}

