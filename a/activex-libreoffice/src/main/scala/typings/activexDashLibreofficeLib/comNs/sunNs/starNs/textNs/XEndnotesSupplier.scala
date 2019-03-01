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
    acquire: js.Function0[scala.Unit],
    getEndnoteSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getEndnotes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndnoteSettings")(EndnoteSettings)
    __obj.updateDynamic("Endnotes")(Endnotes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getEndnoteSettings")(getEndnoteSettings)
    __obj.updateDynamic("getEndnotes")(getEndnotes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XEndnotesSupplier]
  }
}

