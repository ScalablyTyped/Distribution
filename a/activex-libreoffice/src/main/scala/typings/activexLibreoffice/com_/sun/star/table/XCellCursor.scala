package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control the position of a cell cursor.
  * @see com.sun.star.table.CellCursor
  */
trait XCellCursor
  extends StObject
     with XCellRange {
  
  /** points the cursor to a single cell which is the end of a contiguous series of (filled) cells. */
  def gotoEnd(): Unit
  
  /**
    * points the cursor to the next unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the right.
    */
  def gotoNext(): Unit
  
  /**
    * moves the origin of the cursor relative to the current position.
    * @param nColumnOffset is the count of columns to move. A negative value moves the cursor to the left.
    * @param nRowOffset is the count of rows to move. A negative value moves the cursor to the top.
    */
  def gotoOffset(nColumnOffset: Double, nRowOffset: Double): Unit
  
  /**
    * points the cursor to the previous unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the left.
    */
  def gotoPrevious(): Unit
  
  /** points the cursor to a single cell which is the beginning of a contiguous series of (filled) cells. */
  def gotoStart(): Unit
}
object XCellCursor {
  
  inline def apply(
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
  ): XCellCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), gotoEnd = js.Any.fromFunction0(gotoEnd), gotoNext = js.Any.fromFunction0(gotoNext), gotoOffset = js.Any.fromFunction2(gotoOffset), gotoPrevious = js.Any.fromFunction0(gotoPrevious), gotoStart = js.Any.fromFunction0(gotoStart), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellCursor]
  }
  
  extension [Self <: XCellCursor](x: Self) {
    
    inline def setGotoEnd(value: () => Unit): Self = StObject.set(x, "gotoEnd", js.Any.fromFunction0(value))
    
    inline def setGotoNext(value: () => Unit): Self = StObject.set(x, "gotoNext", js.Any.fromFunction0(value))
    
    inline def setGotoOffset(value: (Double, Double) => Unit): Self = StObject.set(x, "gotoOffset", js.Any.fromFunction2(value))
    
    inline def setGotoPrevious(value: () => Unit): Self = StObject.set(x, "gotoPrevious", js.Any.fromFunction0(value))
    
    inline def setGotoStart(value: () => Unit): Self = StObject.set(x, "gotoStart", js.Any.fromFunction0(value))
  }
}
