package typings.antvG2.anon

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetY extends js.Object {
  var offsetY: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object OffsetY {
  @scala.inline
  def apply(offsetY: js.UndefOr[Double] = js.undefined, style: text = null): OffsetY = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetY]
  }
}

