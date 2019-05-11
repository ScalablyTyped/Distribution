package typings
package antdLib.esTooltipPlacementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjustOverflow extends js.Object {
  var adjustX: js.UndefOr[antdLib.antdLibNumbers.`0` | antdLib.antdLibNumbers.`1`] = js.undefined
  var adjustY: js.UndefOr[antdLib.antdLibNumbers.`0` | antdLib.antdLibNumbers.`1`] = js.undefined
}

object AdjustOverflow {
  @scala.inline
  def apply(
    adjustX: antdLib.antdLibNumbers.`0` | antdLib.antdLibNumbers.`1` = null,
    adjustY: antdLib.antdLibNumbers.`0` | antdLib.antdLibNumbers.`1` = null
  ): AdjustOverflow = {
    val __obj = js.Dynamic.literal()
    if (adjustX != null) __obj.updateDynamic("adjustX")(adjustX.asInstanceOf[js.Any])
    if (adjustY != null) __obj.updateDynamic("adjustY")(adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustOverflow]
  }
}

