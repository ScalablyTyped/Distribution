package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitiveFactory2D} interface
  *
  * Use this interface to generate {@link XPrimitive2D} instances
  */
trait XPrimitiveFactory2D
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Create primitives from {@link com.sun.star.drawing.XDrawPage}
    * @param xDrawPage The XDrawPage, for which the primitives are to be generated. Specifying an invalid or empty page here will result in an empty return value.
    * @param aParms Sequence of factory parameters, whose semantics depend on the page to be generated.
    * @returns a sequence of primitives, that consists of the geometrical representation for the given XDrawPage.
    */
  def createPrimitivesFromXDrawPage(
    xDrawPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    aParms: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashInteropLib.SafeArray[XPrimitive2D]
  /**
    * Create primitives from {@link com.sun.star.drawing.XShape}
    * @param xShape The XShape, for which the primitives are to be generated. Specifying an invalid or empty shape here will result in an empty return value.
    * @param aParms Sequence of factory parameters, whose semantics depend on the shape to be generated.
    * @returns a sequence of primitives, that consists of the geometrical representation from the given XShape.
    */
  def createPrimitivesFromXShape(
    xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    aParms: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashInteropLib.SafeArray[XPrimitive2D]
}

