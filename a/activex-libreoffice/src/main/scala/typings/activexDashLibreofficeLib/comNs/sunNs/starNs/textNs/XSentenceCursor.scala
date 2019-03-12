package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to perform cursor movements through sentences. */
trait XSentenceCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: scala.Boolean): scala.Boolean
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): scala.Boolean
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): scala.Boolean
}

object XSentenceCursor {
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
    gotoEndOfSentence: scala.Boolean => scala.Boolean,
    gotoNextSentence: scala.Boolean => scala.Boolean,
    gotoPreviousSentence: scala.Boolean => scala.Boolean,
    gotoRange: (XTextRange, scala.Boolean) => scala.Unit,
    gotoStart: scala.Boolean => scala.Unit,
    gotoStartOfSentence: scala.Boolean => scala.Boolean,
    isCollapsed: () => scala.Boolean,
    isEndOfSentence: () => scala.Boolean,
    isStartOfSentence: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XSentenceCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfSentence = js.Any.fromFunction1(gotoEndOfSentence), gotoNextSentence = js.Any.fromFunction1(gotoNextSentence), gotoPreviousSentence = js.Any.fromFunction1(gotoPreviousSentence), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfSentence = js.Any.fromFunction1(gotoStartOfSentence), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfSentence = js.Any.fromFunction0(isEndOfSentence), isStartOfSentence = js.Any.fromFunction0(isStartOfSentence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XSentenceCursor]
  }
}

