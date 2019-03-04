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
    val __obj = js.Dynamic.literal(chars = chars, colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, style = style, truncate = truncate)
  
    __obj.asInstanceOf[Options]
  }
}

