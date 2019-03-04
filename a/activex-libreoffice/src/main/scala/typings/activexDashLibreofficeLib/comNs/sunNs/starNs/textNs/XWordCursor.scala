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
    gotoEndOfWord: js.Function1[scala.Boolean, scala.Boolean],
    gotoNextWord: js.Function1[scala.Boolean, scala.Boolean],
    gotoPreviousWord: js.Function1[scala.Boolean, scala.Boolean],
    gotoRange: js.Function2[XTextRange, scala.Boolean, scala.Unit],
    gotoStart: js.Function1[scala.Boolean, scala.Unit],
    gotoStartOfWord: js.Function1[scala.Boolean, scala.Boolean],
    isCollapsed: js.Function0[scala.Boolean],
    isEndOfWord: js.Function0[scala.Boolean],
    isStartOfWord: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XWordCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, collapseToEnd = collapseToEnd, collapseToStart = collapseToStart, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, goLeft = goLeft, goRight = goRight, gotoEnd = gotoEnd, gotoEndOfWord = gotoEndOfWord, gotoNextWord = gotoNextWord, gotoPreviousWord = gotoPreviousWord, gotoRange = gotoRange, gotoStart = gotoStart, gotoStartOfWord = gotoStartOfWord, isCollapsed = isCollapsed, isEndOfWord = isEndOfWord, isStartOfWord = isStartOfWord, queryInterface = queryInterface, release = release, setString = setString)
  
    __obj.asInstanceOf[XWordCursor]
  }
}

