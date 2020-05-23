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
trait XTextTableCursor extends XInterface {
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  val RangeName: String
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  def getRangeName(): String
  /**
    * moves the cursor to the bottom neighbor cell.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goDown(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor to the left neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor to the right neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor to the top neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goUp(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor to the cell with the specified name.
    * @param aCellName specifies the name of the cell to go to.
    * @param bExpand determines whether the selection is to be expanded.
    * @see com.sun.star.text.Cell
    */
  def gotoCellByName(aCellName: String, bExpand: Boolean): Boolean
  /**
    * moves the cursor to the bottom right cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoEnd(bExpand: Boolean): Unit
  /**
    * moves the cursor to the top left cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoStart(bExpand: Boolean): Unit
  /**
    * merges the selected range of cells.
    * @see com.sun.star.CellRange
    */
  def mergeRange(): Boolean
  /**
    * splits the range of cells.
    * @param nCount specifies the number of new cells that will be created for each cell contained in the range.
    * @param bHorizontal `TRUE` if the range should be split vertically. Otherwise it will be split horizontally.
    * @see com.sun.star.Cell
    * @see com.sun.star.CellRange
    */
  def splitRange(nCount: Double, bHorizontal: Boolean): Boolean
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
}

