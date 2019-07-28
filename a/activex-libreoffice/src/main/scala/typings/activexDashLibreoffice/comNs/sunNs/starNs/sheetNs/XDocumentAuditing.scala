package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides auditing functions of a document. */
trait XDocumentAuditing extends XInterface {
  /**
    * refreshes all existing auditing arrows on all sheets of the document.
    *
    * Dependencies are marked for all the cells that were marked before, but using current formulas.
    */
  def refreshArrows(): Unit
}

object XDocumentAuditing {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    refreshArrows: () => Unit,
    release: () => Unit
  ): XDocumentAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), refreshArrows = js.Any.fromFunction0(refreshArrows), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentAuditing]
  }
}

