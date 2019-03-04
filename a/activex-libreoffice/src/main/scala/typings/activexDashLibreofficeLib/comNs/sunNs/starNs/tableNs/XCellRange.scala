package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the cells or to sub-ranges of a cell range.
  * @see com.sun.star.table.CellRange
  */
trait XCellRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns a single cell within the range.
    * @param nColumn is the column index of the cell inside the range.
    * @param nRow is the row index of the cell inside the range.
    * @returns the specified cell.
    * @see com.sun.star.table.Cell
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellByPosition(nColumn: scala.Double, nRow: scala.Double): XCell
  /**
    * Returns a sub-range of cells within the range.
    *
    * The sub-range is specified by its name. The format of the range name is dependent of the context of the table. In spreadsheets valid names may be
    * "A1:C5" or "$B$2" or even defined names for cell ranges such as "MySpecialCell".
    * @param aRange the name of the sub-range.
    * @returns the specified cell range.
    * @see com.sun.star.table.CellRange
    */
  def getCellRangeByName(aRange: java.lang.String): XCellRange
  /**
    * Returns a sub-range of cells within the range.
    * @param nLeft is the column index of the first cell inside the range.
    * @param nTop is the row index of the first cell inside the range.
    * @param nRight is the column index of the last cell inside the range.
    * @param nBottom is the row index of the last cell inside the range.
    * @returns the specified cell range.
    * @see com.sun.star.table.CellRange
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellRangeByPosition(nLeft: scala.Double, nTop: scala.Double, nRight: scala.Double, nBottom: scala.Double): XCellRange
}

object XCellRange {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getCellByPosition: js.Function2[scala.Double, scala.Double, XCell],
    getCellRangeByName: js.Function1[java.lang.String, XCellRange],
    getCellRangeByPosition: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, XCellRange],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCellRange = {
    val __obj = js.Dynamic.literal(acquire = acquire, getCellByPosition = getCellByPosition, getCellRangeByName = getCellRangeByName, getCellRangeByPosition = getCellRangeByPosition, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCellRange]
  }
}

