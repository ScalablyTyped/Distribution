package typings
package adoneLib.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends CommonOptions {
  var chars: CharsOptions
  var style: StyleOptions
}

object Options {
  @scala.inline
  def apply(
    chars: CharsOptions,
    colAligns: js.Array[
      adoneLib.adoneLibStrings.left | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.right
    ],
    colWidths: js.Array[scala.Double],
    head: js.Array[java.lang.String],
    rowAligns: js.Array[
      adoneLib.adoneLibStrings.top | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.bottom
    ],
    rowHeights: js.Array[scala.Double],
    style: StyleOptions,
    truncate: java.lang.String
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chars")(chars)
    __obj.updateDynamic("colAligns")(colAligns)
    __obj.updateDynamic("colWidths")(colWidths)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("rowAligns")(rowAligns)
    __obj.updateDynamic("rowHeights")(rowHeights)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[Options]
  }
}

