package typings
package adoneLib.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var colAligns: js.Array[
    adoneLib.adoneLibStrings.left | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.right
  ]
  var colWidths: js.Array[scala.Double]
  var head: js.Array[java.lang.String]
  var rowAligns: js.Array[
    adoneLib.adoneLibStrings.top | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.bottom
  ]
  var rowHeights: js.Array[scala.Double]
  var truncate: java.lang.String
}

object CommonOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[
      adoneLib.adoneLibStrings.left | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.right
    ],
    colWidths: js.Array[scala.Double],
    head: js.Array[java.lang.String],
    rowAligns: js.Array[
      adoneLib.adoneLibStrings.top | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.bottom
    ],
    rowHeights: js.Array[scala.Double],
    truncate: java.lang.String
  ): CommonOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, truncate = truncate)
  
    __obj.asInstanceOf[CommonOptions]
  }
}

