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

object XTextCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    collapseToEnd: js.Function0[scala.Unit],
    collapseToStart: js.Function0[scala.Unit],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    goLeft: js.Function2[scala.Double, scala.Boolean, scala.Boolean],
    goRight: js.Function2[scala.Double, scala.Boolean, scala.Boolean],
    gotoEnd: js.Function1[scala.Boolean, scala.Unit],
    gotoRange: js.Function2[XTextRange, scala.Boolean, scala.Unit],
    gotoStart: js.Function1[scala.Boolean, scala.Unit],
    isCollapsed: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XTextCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, collapseToEnd = collapseToEnd, collapseToStart = collapseToStart, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, goLeft = goLeft, goRight = goRight, gotoEnd = gotoEnd, gotoRange = gotoRange, gotoStart = gotoStart, isCollapsed = isCollapsed, queryInterface = queryInterface, release = release, setString = setString)
  
    __obj.asInstanceOf[XTextCursor]
  }
}

