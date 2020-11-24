package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link XPrimitiveFactory2D} interface
  *
  * Use this interface to generate {@link XPrimitive2D} instances
  */
@js.native
trait XPrimitiveFactory2D extends XInterface {
  
  /**
    * Create primitives from {@link com.sun.star.drawing.XDrawPage}
    * @param xDrawPage The XDrawPage, for which the primitives are to be generated. Specifying an invalid or empty page here will result in an empty return value.
    * @param aParms Sequence of factory parameters, whose semantics depend on the page to be generated.
    * @returns a sequence of primitives, that consists of the geometrical representation for the given XDrawPage.
    */
  def createPrimitivesFromXDrawPage(xDrawPage: XDrawPage, aParms: SeqEquiv[PropertyValue]): SafeArray[XPrimitive2D] = js.native
  
  /**
    * Create primitives from {@link com.sun.star.drawing.XShape}
    * @param xShape The XShape, for which the primitives are to be generated. Specifying an invalid or empty shape here will result in an empty return value.
    * @param aParms Sequence of factory parameters, whose semantics depend on the shape to be generated.
    * @returns a sequence of primitives, that consists of the geometrical representation from the given XShape.
    */
  def createPrimitivesFromXShape(xShape: XShape, aParms: SeqEquiv[PropertyValue]): SafeArray[XPrimitive2D] = js.native
}
object XPrimitiveFactory2D {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createPrimitivesFromXDrawPage: (XDrawPage, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D],
    createPrimitivesFromXShape: (XShape, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrimitiveFactory2D = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createPrimitivesFromXDrawPage = js.Any.fromFunction2(createPrimitivesFromXDrawPage), createPrimitivesFromXShape = js.Any.fromFunction2(createPrimitivesFromXShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrimitiveFactory2D]
  }
  
  @scala.inline
  implicit class XPrimitiveFactory2DOps[Self <: XPrimitiveFactory2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatePrimitivesFromXDrawPage(value: (XDrawPage, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D]): Self = this.set("createPrimitivesFromXDrawPage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreatePrimitivesFromXShape(value: (XShape, SeqEquiv[PropertyValue]) => SafeArray[XPrimitive2D]): Self = this.set("createPrimitivesFromXShape", js.Any.fromFunction2(value))
  }
}
