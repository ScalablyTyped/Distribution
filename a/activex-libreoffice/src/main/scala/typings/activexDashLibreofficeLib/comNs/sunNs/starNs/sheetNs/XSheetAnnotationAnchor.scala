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
    acquire: js.Function0[scala.Unit],
    getAnnotation: js.Function0[XSheetAnnotation],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSheetAnnotationAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Annotation")(Annotation)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAnnotation")(getAnnotation)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetAnnotationAnchor]
  }
}

