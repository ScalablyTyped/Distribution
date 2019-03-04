package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a container of the redline objects of the document. */
trait XRedlinesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  val Redlines: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  def getRedlines(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
}

object XRedlinesSupplier {
  @scala.inline
  def apply(
    Redlines: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    acquire: js.Function0[scala.Unit],
    getRedlines: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRedlinesSupplier = {
    val __obj = js.Dynamic.literal(Redlines = Redlines, acquire = acquire, getRedlines = getRedlines, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XRedlinesSupplier]
  }
}

