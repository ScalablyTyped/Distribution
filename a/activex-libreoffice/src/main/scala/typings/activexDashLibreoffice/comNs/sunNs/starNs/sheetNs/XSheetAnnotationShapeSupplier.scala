package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to get the shape of o annotation
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.CellAnnotationShape
  */
trait XSheetAnnotationShapeSupplier extends XInterface {
  /** returns the shape of the annotation */
  val AnnotationShape: XShape
  /** returns the shape of the annotation */
  def getAnnotationShape(): XShape
}

object XSheetAnnotationShapeSupplier {
  @scala.inline
  def apply(
    AnnotationShape: XShape,
    acquire: () => Unit,
    getAnnotationShape: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetAnnotationShapeSupplier = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape, acquire = js.Any.fromFunction0(acquire), getAnnotationShape = js.Any.fromFunction0(getAnnotationShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetAnnotationShapeSupplier]
  }
}

