package typings.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a cell address within a spreadsheet document. */
trait CellAddress extends js.Object {
  /** is the index of the column where the cell is located. */
  var Column: Double
  /** is the index of the row where the cell is located. */
  var Row: Double
  /** is the index of the sheet that contains the cell. */
  var Sheet: Double
}

object CellAddress {
  @scala.inline
  def apply(Column: Double, Row: Double, Sheet: Double): CellAddress = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAddress]
  }
}

