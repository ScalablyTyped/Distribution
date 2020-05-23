package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a page break in a spreadsheet.
  * @see com.sun.star.sheet.XSheetPageBreak
  */
trait TablePageBreakData extends js.Object {
  /** is `TRUE` for a manual page break, `FALSE` for an automatic one. */
  var ManualBreak: Boolean
  /** the position (column or row index) of the page break. */
  var Position: Double
}

object TablePageBreakData {
  @scala.inline
  def apply(ManualBreak: Boolean, Position: Double): TablePageBreakData = {
    val __obj = js.Dynamic.literal(ManualBreak = ManualBreak.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablePageBreakData]
  }
}

