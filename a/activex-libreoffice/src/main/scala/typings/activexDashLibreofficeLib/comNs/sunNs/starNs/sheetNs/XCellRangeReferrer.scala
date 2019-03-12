package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows direct access to the cells in a named range or to the cells which are visible in a view, without the need to get the document object first.
  * @see com.sun.star.sheet.NamedRange
  * @see com.sun.star.sheet.DatabaseRange
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XCellRangeReferrer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the cell range object that is represented. */
  val ReferredCells: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
  /** returns the cell range object that is represented. */
  def getReferredCells(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
}

object XCellRangeReferrer {
  @scala.inline
  def apply(
    ReferredCells: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    acquire: () => scala.Unit,
    getReferredCells: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCellRangeReferrer = {
    val __obj = js.Dynamic.literal(ReferredCells = ReferredCells, acquire = js.Any.fromFunction0(acquire), getReferredCells = js.Any.fromFunction0(getReferredCells), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCellRangeReferrer]
  }
}

