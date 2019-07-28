package typings.adone.adoneNs.textNs.tableNs.INs

import typings.adone.adoneStrings.bottom
import typings.adone.adoneStrings.center
import typings.adone.adoneStrings.left
import typings.adone.adoneStrings.right
import typings.adone.adoneStrings.top
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
    colAligns: js.Array[left | center | right],
    colWidths: js.Array[Double],
    head: js.Array[String],
    rowAligns: js.Array[top | center | bottom],
    rowHeights: js.Array[Double],
    style: StyleOptions,
    truncate: String
  ): Options = {
    val __obj = js.Dynamic.literal(chars = chars, colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, style = style, truncate = truncate)
  
    __obj.asInstanceOf[Options]
  }
}

