package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the endnotes within the context (e.g. document). */
trait XEndnotesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns a collection of endnotes. */
  val Endnotes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns a collection of endnotes. */
  def getEndnotes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XEndnotesSupplier {
  @scala.inline
  def apply(
    EndnoteSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Endnotes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: () => scala.Unit,
    getEndnoteSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getEndnotes: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal(EndnoteSettings = EndnoteSettings, Endnotes = Endnotes, acquire = js.Any.fromFunction0(acquire), getEndnoteSettings = js.Any.fromFunction0(getEndnoteSettings), getEndnotes = js.Any.fromFunction0(getEndnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEndnotesSupplier]
  }
}

