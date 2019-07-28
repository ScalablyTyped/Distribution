package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

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
    val __obj = js.Dynamic.literal(Column = Column, Row = Row, Sheet = Sheet)
  
    __obj.asInstanceOf[CellAddress]
  }
}

