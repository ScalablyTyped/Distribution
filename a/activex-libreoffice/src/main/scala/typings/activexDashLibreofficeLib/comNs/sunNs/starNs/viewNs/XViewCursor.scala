package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to move a cursor up/down/left/right within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.view.XLineCursor
  */
trait XViewCursor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * moves the cursor the specified number of lines down.
    * @param nCount specifies the number of lines to go down.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already in the bottom row.
    */
  def goDown(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount specifies the number of characters to move.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already at the leftmost position.
    */
  def goLeft(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount specifies the number of characters to move.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already at the rightmost position.
    */
  def goRight(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor the specified number of lines up.
    * @param nCount specifies the number of lines to go up.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already in the top row.
    */
  def goUp(nCount: scala.Double, bExpand: scala.Boolean): scala.Boolean
}

