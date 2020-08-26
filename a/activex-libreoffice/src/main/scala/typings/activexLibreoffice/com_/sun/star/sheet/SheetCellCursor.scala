package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.table.XCellCursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a cursor in a spreadsheet.
  *
  * A cursor is a cell range which provides additional methods to move through the table (i.e. to find specific cell ranges).
  */
@js.native
trait SheetCellCursor
  extends SheetCellRange
     with XCellCursor
     with XSheetCellCursor
     with XUsedAreaCursor

object SheetCellCursor {
  @scala.inline
  def apply(
    SheetCellRange: SheetCellRange,
    XCellCursor: XCellCursor,
    XSheetCellCursor: XSheetCellCursor,
    XUsedAreaCursor: XUsedAreaCursor
  ): SheetCellCursor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SheetCellRange)
    js.Dynamic.global.Object.assign(__obj, XCellCursor)
    js.Dynamic.global.Object.assign(__obj, XSheetCellCursor)
    js.Dynamic.global.Object.assign(__obj, XUsedAreaCursor)
    __obj.asInstanceOf[SheetCellCursor]
  }
}

