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

object XReferenceMarksSupplier {
  @scala.inline
  def apply(
    ReferenceMarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getReferenceMarks: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XReferenceMarksSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ReferenceMarks")(ReferenceMarks)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getReferenceMarks")(getReferenceMarks)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XReferenceMarksSupplier]
  }
}

