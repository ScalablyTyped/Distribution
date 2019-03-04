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
    gotoEndOfSentence: js.Function1[scala.Boolean, scala.Boolean],
    gotoNextSentence: js.Function1[scala.Boolean, scala.Boolean],
    gotoPreviousSentence: js.Function1[scala.Boolean, scala.Boolean],
    gotoRange: js.Function2[XTextRange, scala.Boolean, scala.Unit],
    gotoStart: js.Function1[scala.Boolean, scala.Unit],
    gotoStartOfSentence: js.Function1[scala.Boolean, scala.Boolean],
    isCollapsed: js.Function0[scala.Boolean],
    isEndOfSentence: js.Function0[scala.Boolean],
    isStartOfSentence: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XSentenceCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, collapseToEnd = collapseToEnd, collapseToStart = collapseToStart, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, goLeft = goLeft, goRight = goRight, gotoEnd = gotoEnd, gotoEndOfSentence = gotoEndOfSentence, gotoNextSentence = gotoNextSentence, gotoPreviousSentence = gotoPreviousSentence, gotoRange = gotoRange, gotoStart = gotoStart, gotoStartOfSentence = gotoStartOfSentence, isCollapsed = isCollapsed, isEndOfSentence = isEndOfSentence, isStartOfSentence = isStartOfSentence, queryInterface = queryInterface, release = release, setString = setString)
  
    __obj.asInstanceOf[XSentenceCursor]
  }
}

