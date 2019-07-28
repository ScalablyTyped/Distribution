package typings.antd.libTooltipPlacementsMod

import typings.antd.antdNumbers.`0`
import typings.antd.antdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjustOverflow extends js.Object {
  var adjustX: js.UndefOr[`0` | `1`] = js.undefined
  var adjustY: js.UndefOr[`0` | `1`] = js.undefined
}

object AdjustOverflow {
  @scala.inline
  def apply(adjustX: `0` | `1` = null, adjustY: `0` | `1` = null): AdjustOverflow = {
    val __obj = js.Dynamic.literal()
    if (adjustX != null) __obj.updateDynamic("adjustX")(adjustX.asInstanceOf[js.Any])
    if (adjustY != null) __obj.updateDynamic("adjustY")(adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustOverflow]
  }
}

