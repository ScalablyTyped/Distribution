package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to move a cursor by lines within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.text.XTextViewCursor
  */
trait XLineCursor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * moves the cursor to the end of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoEndOfLine(bExpand: scala.Boolean): scala.Unit
  /**
    * moves the cursor to the start of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoStartOfLine(bExpand: scala.Boolean): scala.Unit
  /** determines if the cursor is positioned at the end of a line. */
  def isAtEndOfLine(): scala.Boolean
  /** determines if the cursor is positioned at the start of a line. */
  def isAtStartOfLine(): scala.Boolean
}

object XLineCursor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    gotoEndOfLine: scala.Boolean => scala.Unit,
    gotoStartOfLine: scala.Boolean => scala.Unit,
    isAtEndOfLine: () => scala.Boolean,
    isAtStartOfLine: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLineCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), gotoEndOfLine = js.Any.fromFunction1(gotoEndOfLine), gotoStartOfLine = js.Any.fromFunction1(gotoStartOfLine), isAtEndOfLine = js.Any.fromFunction0(isAtEndOfLine), isAtStartOfLine = js.Any.fromFunction0(isAtStartOfLine), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLineCursor]
  }
}

