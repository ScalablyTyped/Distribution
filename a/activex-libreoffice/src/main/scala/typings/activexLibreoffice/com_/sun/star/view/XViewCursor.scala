package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a cursor up/down/left/right within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.view.XLineCursor
  */
@js.native
trait XViewCursor extends XInterface {
  
  /**
    * moves the cursor the specified number of lines down.
    * @param nCount specifies the number of lines to go down.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already in the bottom row.
    */
  def goDown(nCount: Double, bExpand: Boolean): Boolean = js.native
  
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount specifies the number of characters to move.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already at the leftmost position.
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean = js.native
  
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount specifies the number of characters to move.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already at the rightmost position.
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean = js.native
  
  /**
    * moves the cursor the specified number of lines up.
    * @param nCount specifies the number of lines to go up.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` )
    * @returns `TRUE` if the cursor was moved, or `FALSE` if it was already in the top row.
    */
  def goUp(nCount: Double, bExpand: Boolean): Boolean = js.native
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
  
  @scala.inline
  implicit class XViewCursorMutableBuilder[Self <: XViewCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoDown(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGoLeft(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goLeft", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGoRight(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goRight", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGoUp(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goUp", js.Any.fromFunction2(value))
  }
}
