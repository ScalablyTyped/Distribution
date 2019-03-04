package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a cell address within a spreadsheet document. */
trait CellAddress extends js.Object {
  /** is the index of the column where the cell is located. */
  var Column: scala.Double
  /** is the index of the row where the cell is located. */
  var Row: scala.Double
  /** is the index of the sheet that contains the cell. */
  var Sheet: scala.Double
}

object CellAddress {
  @scala.inline
  def apply(Column: scala.Double, Row: scala.Double, Sheet: scala.Double): CellAddress = {
    val __obj = js.Dynamic.literal(Column = Column, Row = Row, Sheet = Sheet)
  
    __obj.asInstanceOf[CellAddress]
  }
}

