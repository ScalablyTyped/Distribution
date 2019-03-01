package typings
package adoneLib.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderlessConstructorOptions extends js.Object {
  var colAligns: js.UndefOr[
    js.Array[
      adoneLib.adoneLibStrings.left | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.right
    ]
  ] = js.undefined
  var colWidths: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var head: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var style: js.UndefOr[stdLib.Partial[StyleOptions]] = js.undefined
}

object BorderlessConstructorOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[
      adoneLib.adoneLibStrings.left | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.right
    ] = null,
    colWidths: js.Array[scala.Double] = null,
    head: js.Array[java.lang.String] = null,
    style: stdLib.Partial[StyleOptions] = null
  ): BorderlessConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (colAligns != null) __obj.updateDynamic("colAligns")(colAligns)
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths)
    if (head != null) __obj.updateDynamic("head")(head)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BorderlessConstructorOptions]
  }
}

