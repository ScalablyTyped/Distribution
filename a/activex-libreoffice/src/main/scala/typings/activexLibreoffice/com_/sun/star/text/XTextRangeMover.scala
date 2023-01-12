package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a text range (e.g. a paragraph by itself) within this text.
  *
  * The movement is specified by the number of paragraphs within the order of paragraphs.
  * @see Text
  */
trait XTextRangeMover
  extends StObject
     with XInterface {
  
  /** moves the contents to which **xRange** refers forward or backward. */
  def moveTextRange(xRange: XTextRange, nParagraphs: Double): Unit
}
object XTextRangeMover {
  
  inline def apply(
    acquire: () => Unit,
    moveTextRange: (XTextRange, Double) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTextRangeMover = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), moveTextRange = js.Any.fromFunction2(moveTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextRangeMover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTextRangeMover] (val x: Self) extends AnyVal {
    
    inline def setMoveTextRange(value: (XTextRange, Double) => Unit): Self = StObject.set(x, "moveTextRange", js.Any.fromFunction2(value))
  }
}
