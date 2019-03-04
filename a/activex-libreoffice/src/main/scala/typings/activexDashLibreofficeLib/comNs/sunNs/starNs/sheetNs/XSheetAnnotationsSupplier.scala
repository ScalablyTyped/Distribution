package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a collection of cell annotations. */
trait XSheetAnnotationsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  val Annotations: XSheetAnnotations
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  def getAnnotations(): XSheetAnnotations
}

object XSheetAnnotationsSupplier {
  @scala.inline
  def apply(
    Annotations: XSheetAnnotations,
    acquire: js.Function0[scala.Unit],
    getAnnotations: js.Function0[XSheetAnnotations],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSheetAnnotationsSupplier = {
    val __obj = js.Dynamic.literal(Annotations = Annotations, acquire = acquire, getAnnotations = getAnnotations, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSheetAnnotationsSupplier]
  }
}

