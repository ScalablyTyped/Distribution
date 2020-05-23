package typings.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a cell range address within a spreadsheet document. */
trait CellRangeAddress extends js.Object {
  /** is the index of the column of the right edge of the range. */
  var EndColumn: Double
  /** is the index of the row of the bottom edge of the range. */
  var EndRow: Double
  /** is the index of the sheet that contains the cell range. */
  var Sheet: Double
  /** is the index of the column of the left edge of the range. */
  var StartColumn: Double
  /** is the index of the row of the top edge of the range. */
  var StartRow: Double
}

object CellRangeAddress {
  @scala.inline
  def apply(EndColumn: Double, EndRow: Double, Sheet: Double, StartColumn: Double, StartRow: Double): CellRangeAddress = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndRow = EndRow.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartRow = StartRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRangeAddress]
  }
}

