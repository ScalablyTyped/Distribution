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

