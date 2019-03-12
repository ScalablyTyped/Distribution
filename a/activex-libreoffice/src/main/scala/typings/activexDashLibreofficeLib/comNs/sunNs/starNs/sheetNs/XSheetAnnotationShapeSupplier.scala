package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to get the shape of o annotation
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.CellAnnotationShape
  */
trait XSheetAnnotationShapeSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the shape of the annotation */
  val AnnotationShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /** returns the shape of the annotation */
  def getAnnotationShape(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
}

object XSheetAnnotationShapeSupplier {
  @scala.inline
  def apply(
    AnnotationShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    acquire: () => scala.Unit,
    getAnnotationShape: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSheetAnnotationShapeSupplier = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape, acquire = js.Any.fromFunction0(acquire), getAnnotationShape = js.Any.fromFunction0(getAnnotationShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetAnnotationShapeSupplier]
  }
}

