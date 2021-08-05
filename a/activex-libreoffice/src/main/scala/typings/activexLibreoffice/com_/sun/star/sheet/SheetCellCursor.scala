package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellCursor
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a cursor in a spreadsheet.
  *
  * A cursor is a cell range which provides additional methods to move through the table (i.e. to find specific cell ranges).
  */
trait SheetCellCursor
  extends StObject
     with XCellCursor
     with SheetCellRange
     with XSheetCellCursor
     with XUsedAreaCursor
object SheetCellCursor {
  
  inline def apply(
    SheetCellRange: SheetCellRange,
    XSheetCellCursor: XSheetCellCursor,
    XUsedAreaCursor: XUsedAreaCursor,
    acquire: () => Unit,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    gotoEnd: () => Unit,
    gotoNext: () => Unit,
    gotoOffset: (Double, Double) => Unit,
    gotoPrevious: () => Unit,
    gotoStart: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): SheetCellCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), gotoEnd = js.Any.fromFunction0(gotoEnd), gotoNext = js.Any.fromFunction0(gotoNext), gotoOffset = js.Any.fromFunction2(gotoOffset), gotoPrevious = js.Any.fromFunction0(gotoPrevious), gotoStart = js.Any.fromFunction0(gotoStart), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    js.Dynamic.global.Object.assign(__obj, SheetCellRange)
    js.Dynamic.global.Object.assign(__obj, XSheetCellCursor)
    js.Dynamic.global.Object.assign(__obj, XUsedAreaCursor)
    __obj.asInstanceOf[SheetCellCursor]
  }
}
