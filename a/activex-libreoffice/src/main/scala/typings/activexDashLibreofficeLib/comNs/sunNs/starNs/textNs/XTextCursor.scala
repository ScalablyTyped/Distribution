package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends a text range by method to modify its position. */
trait XTextCursor extends XTextRange {
  /** sets the start of the position to the end. */
  def collapseToEnd(): scala.Unit
  /** sets the end of the position to the start. */
  def collapseToStart(): scala.Unit
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goLeft(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goRight(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /** moves the cursor to the end of the text. */
  def gotoEnd(bExpand: scala.Boolean): scala.Unit
  /** moves or expands the cursor to a specified {@link TextRange} . */
  def gotoRange(xRange: XTextRange, bExpand: scala.Boolean): scala.Unit
  /** moves the cursor to the start of the text. */
  def gotoStart(bExpand: scala.Boolean): scala.Unit
  /** determines if the start and end positions are the same. */
  def isCollapsed(): scala.Boolean
}

