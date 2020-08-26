package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control the position of a cell cursor.
  * @see com.sun.star.table.CellCursor
  */
@js.native
trait XCellCursor extends XCellRange {
  /** points the cursor to a single cell which is the end of a contiguous series of (filled) cells. */
  def gotoEnd(): Unit = js.native
  /**
    * points the cursor to the next unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the right.
    */
  def gotoNext(): Unit = js.native
  /**
    * moves the origin of the cursor relative to the current position.
    * @param nColumnOffset is the count of columns to move. A negative value moves the cursor to the left.
    * @param nRowOffset is the count of rows to move. A negative value moves the cursor to the top.
    */
  def gotoOffset(nColumnOffset: Double, nRowOffset: Double): Unit = js.native
  /**
    * points the cursor to the previous unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the left.
    */
  def gotoPrevious(): Unit = js.native
  /** points the cursor to a single cell which is the beginning of a contiguous series of (filled) cells. */
  def gotoStart(): Unit = js.native
}

object XCellCursor {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class XCellCursorOps[Self <: XCellCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGotoEnd(value: () => Unit): Self = this.set("gotoEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setGotoNext(value: () => Unit): Self = this.set("gotoNext", js.Any.fromFunction0(value))
    @scala.inline
    def setGotoOffset(value: (Double, Double) => Unit): Self = this.set("gotoOffset", js.Any.fromFunction2(value))
    @scala.inline
    def setGotoPrevious(value: () => Unit): Self = this.set("gotoPrevious", js.Any.fromFunction0(value))
    @scala.inline
    def setGotoStart(value: () => Unit): Self = this.set("gotoStart", js.Any.fromFunction0(value))
  }
  
}

