package typings.atAntvG2

import typings.atAntvG2.atAntvG2Mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetX extends js.Object {
  var offsetX: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object Anon_OffsetX {
  @scala.inline
  def apply(offsetX: Int | Double = null, style: text = null): Anon_OffsetX = {
    val __obj = js.Dynamic.literal()
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OffsetX]
  }
}

