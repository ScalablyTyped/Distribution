package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a cell annotation attached to a spreadsheet cell.
  * @see com.sun.star.sheet.SheetCell
  * @see com.sun.star.sheet.CellAnnotation
  */
trait XSheetAnnotationAnchor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the annotation at this anchor. */
  val Annotation: XSheetAnnotation
  /** returns the annotation at this anchor. */
  def getAnnotation(): XSheetAnnotation
}

object XSheetAnnotationAnchor {
  @scala.inline
  def apply(
    Annotation: XSheetAnnotation,
    acquire: () => scala.Unit,
    getAnnotation: () => XSheetAnnotation,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSheetAnnotationAnchor = {
    val __obj = js.Dynamic.literal(Annotation = Annotation, acquire = js.Any.fromFunction0(acquire), getAnnotation = js.Any.fromFunction0(getAnnotation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetAnnotationAnchor]
  }
}

