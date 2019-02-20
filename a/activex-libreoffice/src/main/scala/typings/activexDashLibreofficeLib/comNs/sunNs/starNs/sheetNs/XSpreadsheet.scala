package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to create a cell range cursor. */
trait XSpreadsheet extends XSheetCellRange {
  /**
    * creates a cell cursor including the whole spreadsheet.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursor(): XSheetCellCursor
  /**
    * creates a cell cursor to travel in the given range context.
    * @param aRange the cell range for the cursor.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursorByRange(aRange: XSheetCellRange): XSheetCellCursor
}

