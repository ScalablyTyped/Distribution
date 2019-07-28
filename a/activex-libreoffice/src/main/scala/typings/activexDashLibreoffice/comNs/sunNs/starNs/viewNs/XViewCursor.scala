package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to move a cursor up/down/left/right within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.view.XLineCursor
  */
trait XViewCursor extends XInterface {
  /**
    * moves the cursor the specified number of lines down.
    * @param nCount specifies the number of lines to go down.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already in the bottom row.
    */
  def goDown(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount specifies the number of characters to move.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already at the leftmost position.
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount specifies the number of characters to move.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already at the rightmost position.
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean
  /**
    * moves the cursor the specified number of lines up.
    * @param nCount specifies the number of lines to go up.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already in the top row.
    */
  def goUp(nCount: Double, bExpand: Boolean): Boolean
}

object XViewCursor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    goDown: (Double, Boolean) => Boolean,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    goUp: (Double, Boolean) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), goDown = js.Any.fromFunction2(goDown), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), goUp = js.Any.fromFunction2(goUp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XViewCursor]
  }
}

