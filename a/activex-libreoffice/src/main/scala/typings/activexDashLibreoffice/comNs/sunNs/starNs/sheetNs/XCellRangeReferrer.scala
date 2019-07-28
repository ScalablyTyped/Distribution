package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows direct access to the cells in a named range or to the cells which are visible in a view, without the need to get the document object first.
  * @see com.sun.star.sheet.NamedRange
  * @see com.sun.star.sheet.DatabaseRange
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XCellRangeReferrer extends XInterface {
  /** returns the cell range object that is represented. */
  val ReferredCells: XCellRange
  /** returns the cell range object that is represented. */
  def getReferredCells(): XCellRange
}

object XCellRangeReferrer {
  @scala.inline
  def apply(
    ReferredCells: XCellRange,
    acquire: () => Unit,
    getReferredCells: () => XCellRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRangeReferrer = {
    val __obj = js.Dynamic.literal(ReferredCells = ReferredCells, acquire = js.Any.fromFunction0(acquire), getReferredCells = js.Any.fromFunction0(getReferredCells), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCellRangeReferrer]
  }
}

