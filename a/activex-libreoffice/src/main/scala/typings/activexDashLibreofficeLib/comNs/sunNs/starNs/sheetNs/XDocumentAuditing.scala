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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refreshArrows: () => scala.Unit,
    release: () => scala.Unit
  ): XDocumentAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), refreshArrows = js.Any.fromFunction0(refreshArrows), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentAuditing]
  }
}

