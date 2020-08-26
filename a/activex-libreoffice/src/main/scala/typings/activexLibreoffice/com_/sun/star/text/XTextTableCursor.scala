package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link TextTableCursor} provide methods to navigate through the table structure, to merge and split cells
  * @see com.sun.star.text.TextTable
  * @see com.sun.star.text.TextTableCursor
  * @see com.sun.star.text.Cell
  * @see com.sun.star.text.XTextTable
  */
@js.native
trait XTextTableCursor extends XInterface {
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  val RangeName: String = js.native
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  def getRangeName(): String = js.native
  /**
    * moves the cursor to the bottom neighbor cell.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goDown(nCount: Double, bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the left neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the right neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the top neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goUp(nCount: Double, bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the cell with the specified name.
    * @param aCellName specifies the name of the cell to go to.
    * @param bExpand determines whether the selection is to be expanded.
    * @see com.sun.star.text.Cell
    */
  def gotoCellByName(aCellName: String, bExpand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the bottom right cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoEnd(bExpand: Boolean): Unit = js.native
  /**
    * moves the cursor to the top left cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoStart(bExpand: Boolean): Unit = js.native
  /**
    * merges the selected range of cells.
    * @see com.sun.star.CellRange
    */
  def mergeRange(): Boolean = js.native
  /**
    * splits the range of cells.
    * @param nCount specifies the number of new cells that will be created for each cell contained in the range.
    * @param bHorizontal `TRUE` if the range should be split vertically. Otherwise it will be split horizontally.
    * @see com.sun.star.Cell
    * @see com.sun.star.CellRange
    */
  def splitRange(nCount: Double, bHorizontal: Boolean): Boolean = js.native
}

object XTextTableCursor {
  @scala.inline
  def apply(
    RangeName: String,
    acquire: () => Unit,
    getRangeName: () => String,
    goDown: (Double, Boolean) => Boolean,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    goUp: (Double, Boolean) => Boolean,
    gotoCellByName: (String, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoStart: Boolean => Unit,
    mergeRange: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    splitRange: (Double, Boolean) => Boolean
  ): XTextTableCursor = {
    val __obj = js.Dynamic.literal(RangeName = RangeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRangeName = js.Any.fromFunction0(getRangeName), goDown = js.Any.fromFunction2(goDown), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), goUp = js.Any.fromFunction2(goUp), gotoCellByName = js.Any.fromFunction2(gotoCellByName), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoStart = js.Any.fromFunction1(gotoStart), mergeRange = js.Any.fromFunction0(mergeRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), splitRange = js.Any.fromFunction2(splitRange))
    __obj.asInstanceOf[XTextTableCursor]
  }
  @scala.inline
  implicit class XTextTableCursorOps[Self <: XTextTableCursor] (val x: Self) extends AnyVal {
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
    def setRangeName(value: String): Self = this.set("RangeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRangeName(value: () => String): Self = this.set("getRangeName", js.Any.fromFunction0(value))
    @scala.inline
    def setGoDown(value: (Double, Boolean) => Boolean): Self = this.set("goDown", js.Any.fromFunction2(value))
    @scala.inline
    def setGoLeft(value: (Double, Boolean) => Boolean): Self = this.set("goLeft", js.Any.fromFunction2(value))
    @scala.inline
    def setGoRight(value: (Double, Boolean) => Boolean): Self = this.set("goRight", js.Any.fromFunction2(value))
    @scala.inline
    def setGoUp(value: (Double, Boolean) => Boolean): Self = this.set("goUp", js.Any.fromFunction2(value))
    @scala.inline
    def setGotoCellByName(value: (String, Boolean) => Boolean): Self = this.set("gotoCellByName", js.Any.fromFunction2(value))
    @scala.inline
    def setGotoEnd(value: Boolean => Unit): Self = this.set("gotoEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setGotoStart(value: Boolean => Unit): Self = this.set("gotoStart", js.Any.fromFunction1(value))
    @scala.inline
    def setMergeRange(value: () => Boolean): Self = this.set("mergeRange", js.Any.fromFunction0(value))
    @scala.inline
    def setSplitRange(value: (Double, Boolean) => Boolean): Self = this.set("splitRange", js.Any.fromFunction2(value))
  }
  
}

