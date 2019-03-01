package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the footnotes within the context (e.g. document). */
trait XFootnotesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the footnotes settings of the document. */
  val FootnoteSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns a collection of footnotes. */
  val Footnotes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** @returns the footnotes settings of the document. */
  def getFootnoteSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns a collection of footnotes. */
  def getFootnotes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XFootnotesSupplier {
  @scala.inline
  def apply(
    FootnoteSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Footnotes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: js.Function0[scala.Unit],
    getFootnoteSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getFootnotes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFootnotesSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FootnoteSettings")(FootnoteSettings)
    __obj.updateDynamic("Footnotes")(Footnotes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFootnoteSettings")(getFootnoteSettings)
    __obj.updateDynamic("getFootnotes")(getFootnotes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFootnotesSupplier]
  }
}

