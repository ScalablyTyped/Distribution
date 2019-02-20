package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a cursor in a spreadsheet.
  *
  * A cursor is a cell range which provides additional methods to move through the table (i.e. to find specific cell ranges).
  */
trait SheetCellCursor
  extends SheetCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellCursor
     with XSheetCellCursor
     with XUsedAreaCursor

