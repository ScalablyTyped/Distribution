package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the reference marks within this context (i.e. document).
  *
  * A reference mark is used to refer to text positions in a text document.
  */
trait XReferenceMarksSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of reference marks. */
  val ReferenceMarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of reference marks. */
  def getReferenceMarks(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

