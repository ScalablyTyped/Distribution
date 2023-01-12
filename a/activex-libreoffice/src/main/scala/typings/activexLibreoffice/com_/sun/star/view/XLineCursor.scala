package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a cursor by lines within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.text.XTextViewCursor
  */
trait XLineCursor
  extends StObject
     with XInterface {
  
  /**
    * moves the cursor to the end of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoEndOfLine(bExpand: Boolean): Unit
  
  /**
    * moves the cursor to the start of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoStartOfLine(bExpand: Boolean): Unit
  
  /** determines if the cursor is positioned at the end of a line. */
  def isAtEndOfLine(): Boolean
  
  /** determines if the cursor is positioned at the start of a line. */
  def isAtStartOfLine(): Boolean
}
object XLineCursor {
  
  inline def apply(
    acquire: () => Unit,
    gotoEndOfLine: Boolean => Unit,
    gotoStartOfLine: Boolean => Unit,
    isAtEndOfLine: () => Boolean,
    isAtStartOfLine: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XLineCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), gotoEndOfLine = js.Any.fromFunction1(gotoEndOfLine), gotoStartOfLine = js.Any.fromFunction1(gotoStartOfLine), isAtEndOfLine = js.Any.fromFunction0(isAtEndOfLine), isAtStartOfLine = js.Any.fromFunction0(isAtStartOfLine), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLineCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLineCursor] (val x: Self) extends AnyVal {
    
    inline def setGotoEndOfLine(value: Boolean => Unit): Self = StObject.set(x, "gotoEndOfLine", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfLine(value: Boolean => Unit): Self = StObject.set(x, "gotoStartOfLine", js.Any.fromFunction1(value))
    
    inline def setIsAtEndOfLine(value: () => Boolean): Self = StObject.set(x, "isAtEndOfLine", js.Any.fromFunction0(value))
    
    inline def setIsAtStartOfLine(value: () => Boolean): Self = StObject.set(x, "isAtStartOfLine", js.Any.fromFunction0(value))
  }
}
