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

