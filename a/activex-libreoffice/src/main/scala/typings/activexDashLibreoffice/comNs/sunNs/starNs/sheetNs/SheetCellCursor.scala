package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellCursor
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
     with XCellCursor
     with XSheetCellCursor
     with XUsedAreaCursor

object SheetCellCursor {
  @scala.inline
  def apply(
    SheetCellRange: SheetCellRange = null,
    XCellCursor: XCellCursor = null,
    XSheetCellCursor: XSheetCellCursor = null,
    XUsedAreaCursor: XUsedAreaCursor = null
  ): SheetCellCursor = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, SheetCellRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetCellCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XUsedAreaCursor)
    __obj.asInstanceOf[SheetCellCursor]
  }
}

