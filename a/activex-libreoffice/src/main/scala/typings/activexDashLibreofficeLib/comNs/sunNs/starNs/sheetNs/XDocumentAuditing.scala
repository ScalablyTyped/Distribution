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

