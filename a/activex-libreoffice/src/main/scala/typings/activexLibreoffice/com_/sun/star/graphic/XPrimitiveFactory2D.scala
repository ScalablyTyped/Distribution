package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link XPrimitiveFactory2D} interface
  *
  * Use this interface to generate {@link XPrimitive2D} instances
  */
trait XPrimitiveFactory2D
  extends StObject
     with XInterface {
  
  /**
    * Create primitives from {@link com.sun.star.drawing.XDrawPage}
    * @param xDrawPage The XDrawPage, for which the primitives are to be generated. Specifying an invalid or empty page here will result in an empty return value.
    * @param aParms Sequence of factory parameters, whose semantics depend on the page to be generated.
    * @returns a sequence of primitives, that consists of the geometrical representation for the given XDrawPage.
    */
  def createPrimitivesFromXDrawPage(xDrawPage: XDrawPage, aParms: SeqEquiv[PropertyValue]): SafeArray[XPrimitive2D]
  
  /**
    * Create primitives from {@link com.sun.star.drawing.XShape}
    * @param xShape The XShape, for which the primitives are to be generated. Specifying an invalid or empty shape here will result in an empty return value.
    * @param aParms Sequence of factory parameters, whose semantics depend on the shape to be generated.
    * @returns a sequence of primitives, that consists of the geometrical representation from the given XShape.
    */
  def createPrimitivesFromXShape(xShape: XShape, aParms: SeqEquiv[PropertyValue]): SafeArray[XPrimitive2D]
}
object XPrimitiveFactory2D {
  
  inline def apply(
    acquire: () => Unit,
    createPrimitivesFromXDrawPage: (XDrawPage, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D],
    createPrimitivesFromXShape: (XShape, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPrimitiveFactory2D = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createPrimitivesFromXDrawPage = js.Any.fromFunction2(createPrimitivesFromXDrawPage), createPrimitivesFromXShape = js.Any.fromFunction2(createPrimitivesFromXShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrimitiveFactory2D]
  }
  
  extension [Self <: XPrimitiveFactory2D](x: Self) {
    
    inline def setCreatePrimitivesFromXDrawPage(value: (XDrawPage, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D]): Self = StObject.set(x, "createPrimitivesFromXDrawPage", js.Any.fromFunction2(value))
    
    inline def setCreatePrimitivesFromXShape(value: (XShape, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D]): Self = StObject.set(x, "createPrimitivesFromXShape", js.Any.fromFunction2(value))
  }
}
