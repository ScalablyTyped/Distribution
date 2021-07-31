package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the collection of com::sun::star::drawing::TextShapes. */
trait XTextShapesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of shapes.
    * @see com.sun.star.drawing.DrawPage
    */
  val Shapes: XIndexAccess
  
  /**
    * returns the collection of shapes.
    * @see com.sun.star.drawing.DrawPage
    */
  def getShapes(): XIndexAccess
}
object XTextShapesSupplier {
  
  @scala.inline
  def apply(
    Shapes: XIndexAccess,
    acquire: () => Unit,
    getShapes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextShapesSupplier = {
    val __obj = js.Dynamic.literal(Shapes = Shapes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getShapes = js.Any.fromFunction0(getShapes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextShapesSupplier]
  }
  
  @scala.inline
  implicit class XTextShapesSupplierMutableBuilder[Self <: XTextShapesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetShapes(value: () => XIndexAccess): Self = StObject.set(x, "getShapes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShapes(value: XIndexAccess): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
  }
}
