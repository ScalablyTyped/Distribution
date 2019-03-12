package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
trait XTextTableCursor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  val RangeName: java.lang.String
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  def getRangeName(): java.lang.String
  /**
    * moves the cursor to the bottom neighbor cell.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goDown(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the left neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goLeft(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the right neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goRight(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the top neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goUp(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the cell with the specified name.
    * @param aCellName specifies the name of the cell to go to.
    * @param bExpand determines whether the selection is to be expanded.
    * @see com.sun.star.text.Cell
    */
  def gotoCellByName(aCellName: java.lang.String, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the bottom right cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoEnd(bExpand: scala.Boolean): scala.Unit
  /**
    * moves the cursor to the top left cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoStart(bExpand: scala.Boolean): scala.Unit
  /**
    * merges the selected range of cells.
    * @see com.sun.star.CellRange
    */
  def mergeRange(): scala.Boolean
  /**
    * splits the range of cells.
    * @param nCount specifies the number of new cells that will be created for each cell contained in the range.
    * @param bHorizontal `TRUE` if the range should be split vertically. Otherwise it will be split horizontally.
    * @see com.sun.star.Cell
    * @see com.sun.star.CellRange
    */
  def splitRange(nCount: scala.Double, bHorizontal: scala.Boolean): scala.Boolean
}

object XTextTableCursor {
  @scala.inline
  def apply(
    RangeName: java.lang.String,
    acquire: () => scala.Unit,
    getRangeName: () => java.lang.String,
    goDown: (scala.Double, scala.Boolean) => scala.Boolean,
    goLeft: (scala.Double, scala.Boolean) => scala.Boolean,
    goRight: (scala.Double, scala.Boolean) => scala.Boolean,
    goUp: (scala.Double, scala.Boolean) => scala.Boolean,
    gotoCellByName: (java.lang.String, scala.Boolean) => scala.Boolean,
    gotoEnd: scala.Boolean => scala.Unit,
    gotoStart: scala.Boolean => scala.Unit,
    mergeRange: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    splitRange: (scala.Double, scala.Boolean) => scala.Boolean
  ): XTextTableCursor = {
    val __obj = js.Dynamic.literal(RangeName = RangeName, acquire = js.Any.fromFunction0(acquire), getRangeName = js.Any.fromFunction0(getRangeName), goDown = js.Any.fromFunction2(goDown), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), goUp = js.Any.fromFunction2(goUp), gotoCellByName = js.Any.fromFunction2(gotoCellByName), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoStart = js.Any.fromFunction1(gotoStart), mergeRange = js.Any.fromFunction0(mergeRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), splitRange = js.Any.fromFunction2(splitRange))
  
    __obj.asInstanceOf[XTextTableCursor]
  }
}

