package typings.adone.adoneNs.textNs.tableNs.INs

import typings.adone.adoneStrings.center
import typings.adone.adoneStrings.left
import typings.adone.adoneStrings.right
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderlessConstructorOptions extends js.Object {
  var colAligns: js.UndefOr[js.Array[left | center | right]] = js.undefined
  var colWidths: js.UndefOr[js.Array[Double]] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var style: js.UndefOr[Partial[StyleOptions]] = js.undefined
}

object BorderlessConstructorOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[left | center | right] = null,
    colWidths: js.Array[Double] = null,
    head: js.Array[String] = null,
    style: Partial[StyleOptions] = null
  ): BorderlessConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (colAligns != null) __obj.updateDynamic("colAligns")(colAligns)
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths)
    if (head != null) __obj.updateDynamic("head")(head)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BorderlessConstructorOptions]
  }
}

