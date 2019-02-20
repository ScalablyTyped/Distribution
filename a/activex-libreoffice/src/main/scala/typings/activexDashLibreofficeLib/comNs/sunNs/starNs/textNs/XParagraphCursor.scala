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

