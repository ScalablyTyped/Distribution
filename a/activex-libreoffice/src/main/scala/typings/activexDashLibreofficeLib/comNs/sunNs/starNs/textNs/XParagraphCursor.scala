package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to move paragraph by paragraph. */
trait XParagraphCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: scala.Boolean): scala.Boolean
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): scala.Boolean
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): scala.Boolean
}

object XParagraphCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: () => scala.Unit,
    collapseToEnd: () => scala.Unit,
    collapseToStart: () => scala.Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    goLeft: (scala.Double, scala.Boolean) => scala.Boolean,
    goRight: (scala.Double, scala.Boolean) => scala.Boolean,
    gotoEnd: scala.Boolean => scala.Unit,
    gotoEndOfParagraph: scala.Boolean => scala.Boolean,
    gotoNextParagraph: scala.Boolean => scala.Boolean,
    gotoPreviousParagraph: scala.Boolean => scala.Boolean,
    gotoRange: (XTextRange, scala.Boolean) => scala.Unit,
    gotoStart: scala.Boolean => scala.Unit,
    gotoStartOfParagraph: scala.Boolean => scala.Boolean,
    isCollapsed: () => scala.Boolean,
    isEndOfParagraph: () => scala.Boolean,
    isStartOfParagraph: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XParagraphCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfParagraph = js.Any.fromFunction1(gotoEndOfParagraph), gotoNextParagraph = js.Any.fromFunction1(gotoNextParagraph), gotoPreviousParagraph = js.Any.fromFunction1(gotoPreviousParagraph), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfParagraph = js.Any.fromFunction1(gotoStartOfParagraph), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfParagraph = js.Any.fromFunction0(isEndOfParagraph), isStartOfParagraph = js.Any.fromFunction0(isStartOfParagraph), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XParagraphCursor]
  }
}

