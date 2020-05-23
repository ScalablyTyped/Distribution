package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends a text range by method to modify its position. */
trait XTextCursor extends XTextRange {
  /** sets the start of the position to the end. */
  def collapseToEnd(): Unit
  /** sets the end of the position to the start. */
  def collapseToStart(): Unit
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean
  /** moves the cursor to the end of the text. */
  def gotoEnd(bExpand: Boolean): Unit
  /** moves or expands the cursor to a specified {@link TextRange} . */
  def gotoRange(xRange: XTextRange, bExpand: Boolean): Unit
  /** moves the cursor to the start of the text. */
  def gotoStart(bExpand: Boolean): Unit
  /** determines if the start and end positions are the same. */
  def isCollapsed(): Boolean
}

object XTextCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    isCollapsed: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XTextCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), isCollapsed = js.Any.fromFunction0(isCollapsed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XTextCursor]
  }
}

