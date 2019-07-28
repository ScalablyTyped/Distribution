package typings.adone.adoneNs.textNs.tableNs.INs

import typings.adone.adoneStrings.bottom
import typings.adone.adoneStrings.center
import typings.adone.adoneStrings.left
import typings.adone.adoneStrings.right
import typings.adone.adoneStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var colAligns: js.Array[left | center | right]
  var colWidths: js.Array[Double]
  var head: js.Array[String]
  var rowAligns: js.Array[top | center | bottom]
  var rowHeights: js.Array[Double]
  var truncate: String
}

object CommonOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[left | center | right],
    colWidths: js.Array[Double],
    head: js.Array[String],
    rowAligns: js.Array[top | center | bottom],
    rowHeights: js.Array[Double],
    truncate: String
  ): CommonOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, truncate = truncate)
  
    __obj.asInstanceOf[CommonOptions]
  }
}

