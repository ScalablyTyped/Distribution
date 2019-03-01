package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides auditing functions of a document. */
trait XDocumentAuditing
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * refreshes all existing auditing arrows on all sheets of the document.
    *
    * Dependencies are marked for all the cells that were marked before, but using current formulas.
    */
  def refreshArrows(): scala.Unit
}

object XDocumentAuditing {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refreshArrows: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit]
  ): XDocumentAuditing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refreshArrows")(refreshArrows)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDocumentAuditing]
  }
}

