package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XCellRange
     with XColumnRowRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet {
  /** stores the current column count of this table */
  var ColumnCount: scala.Double
  /** stores the current row count of this table */
  var RowCount: scala.Double
  /**
    * creates a cell cursor including the whole table
    * @see com.sun.star.table.CellCursor
    */
  def createCursor(): XCellCursor
  /**
    * creates a cell cursor to travel in the given range context.
    * @param Range the cell range for the cursor.
    * @see com.sun.star.table.CellCursor
    * @throws com::sun::star::lang::IllegalArgumentException if the given reference is empty or not a range from this table.
    */
  def createCursorByRange(Range: XCellRange): XCellCursor
}

