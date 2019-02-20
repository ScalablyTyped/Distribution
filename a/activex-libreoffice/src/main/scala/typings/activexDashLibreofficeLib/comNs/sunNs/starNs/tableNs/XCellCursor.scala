package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control the position of a cell cursor.
  * @see com.sun.star.table.CellCursor
  */
trait XCellCursor extends XCellRange {
  /** points the cursor to a single cell which is the end of a contiguous series of (filled) cells. */
  def gotoEnd(): scala.Unit
  /**
    * points the cursor to the next unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the right.
    */
  def gotoNext(): scala.Unit
  /**
    * moves the origin of the cursor relative to the current position.
    * @param nColumnOffset is the count of columns to move. A negative value moves the cursor to the left.
    * @param nRowOffset is the count of rows to move. A negative value moves the cursor to the top.
    */
  def gotoOffset(nColumnOffset: scala.Double, nRowOffset: scala.Double): scala.Unit
  /**
    * points the cursor to the previous unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the left.
    */
  def gotoPrevious(): scala.Unit
  /** points the cursor to a single cell which is the beginning of a contiguous series of (filled) cells. */
  def gotoStart(): scala.Unit
}

