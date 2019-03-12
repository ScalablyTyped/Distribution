package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to move a cursor word by word. */
trait XWordCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current word.
    * @returns `TRUE` if the cursor is now at the end of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfWord(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the next word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the next word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextWord(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the previous word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the previous word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousWord(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current word.
    * @returns `TRUE` if the cursor is now at the start of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfWord(bExpand: scala.Boolean): scala.Boolean
  /** determines if the cursor is positioned at the end of a word. */
  def isEndOfWord(): scala.Boolean
  /** determines if the cursor is positioned at the start of a word. */
  def isStartOfWord(): scala.Boolean
}

object XWordCursor {
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
    gotoEndOfWord: scala.Boolean => scala.Boolean,
    gotoNextWord: scala.Boolean => scala.Boolean,
    gotoPreviousWord: scala.Boolean => scala.Boolean,
    gotoRange: (XTextRange, scala.Boolean) => scala.Unit,
    gotoStart: scala.Boolean => scala.Unit,
    gotoStartOfWord: scala.Boolean => scala.Boolean,
    isCollapsed: () => scala.Boolean,
    isEndOfWord: () => scala.Boolean,
    isStartOfWord: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XWordCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfWord = js.Any.fromFunction1(gotoEndOfWord), gotoNextWord = js.Any.fromFunction1(gotoNextWord), gotoPreviousWord = js.Any.fromFunction1(gotoPreviousWord), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfWord = js.Any.fromFunction1(gotoStartOfWord), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfWord = js.Any.fromFunction0(isEndOfWord), isStartOfWord = js.Any.fromFunction0(isStartOfWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XWordCursor]
  }
}

