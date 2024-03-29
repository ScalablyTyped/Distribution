package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows insertion of shapes at different positions.
  * @since LibreOffice 4.2
  */
trait XShapes2 extends StObject {
  
  /**
    * Insert a new shape to the bottom of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addBottom(xShape: XShape): Unit
  
  /**
    * Insert a new shape to the top of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addTop(xShape: XShape): Unit
}
object XShapes2 {
  
  inline def apply(addBottom: XShape => Unit, addTop: XShape => Unit): XShapes2 = {
    val __obj = js.Dynamic.literal(addBottom = js.Any.fromFunction1(addBottom), addTop = js.Any.fromFunction1(addTop))
    __obj.asInstanceOf[XShapes2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XShapes2] (val x: Self) extends AnyVal {
    
    inline def setAddBottom(value: XShape => Unit): Self = StObject.set(x, "addBottom", js.Any.fromFunction1(value))
    
    inline def setAddTop(value: XShape => Unit): Self = StObject.set(x, "addTop", js.Any.fromFunction1(value))
  }
}
