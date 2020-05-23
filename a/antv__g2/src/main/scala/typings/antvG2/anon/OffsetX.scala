package typings.antvG2.anon

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetX extends js.Object {
  var offsetX: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object OffsetX {
  @scala.inline
  def apply(offsetX: js.UndefOr[Double] = js.undefined, style: text = null): OffsetX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
}

