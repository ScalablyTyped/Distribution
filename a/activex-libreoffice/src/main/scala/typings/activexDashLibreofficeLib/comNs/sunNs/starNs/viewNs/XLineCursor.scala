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

