package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the reference marks within this context (i.e. document).
  *
  * A reference mark is used to refer to text positions in a text document.
  */
trait XReferenceMarksSupplier extends XInterface {
  /** @returns the collection of reference marks. */
  val ReferenceMarks: XNameAccess
  /** @returns the collection of reference marks. */
  def getReferenceMarks(): XNameAccess
}

object XReferenceMarksSupplier {
  @scala.inline
  def apply(
    ReferenceMarks: XNameAccess,
    acquire: () => Unit,
    getReferenceMarks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XReferenceMarksSupplier = {
    val __obj = js.Dynamic.literal(ReferenceMarks = ReferenceMarks, acquire = js.Any.fromFunction0(acquire), getReferenceMarks = js.Any.fromFunction0(getReferenceMarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XReferenceMarksSupplier]
  }
}

