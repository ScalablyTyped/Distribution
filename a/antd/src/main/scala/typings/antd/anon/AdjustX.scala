package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjustX extends js.Object {
  var adjustX: js.UndefOr[Boolean] = js.undefined
  var adjustY: js.UndefOr[Boolean] = js.undefined
}

object AdjustX {
  @scala.inline
  def apply(adjustX: js.UndefOr[Boolean] = js.undefined, adjustY: js.UndefOr[Boolean] = js.undefined): AdjustX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustX)) __obj.updateDynamic("adjustX")(adjustX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustY)) __obj.updateDynamic("adjustY")(adjustY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustX]
  }
}

