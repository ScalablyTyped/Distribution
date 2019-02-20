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

