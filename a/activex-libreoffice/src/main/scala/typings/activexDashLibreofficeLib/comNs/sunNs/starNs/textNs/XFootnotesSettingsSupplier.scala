package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link FootnoteSettings} with the context (e.g. document). */
trait XFootnotesSettingsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns {@link FootnoteSettings} of the object. */
  val FootnotesSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns {@link FootnoteSettings} of the object. */
  def getFootnotesSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XFootnotesSettingsSupplier {
  @scala.inline
  def apply(
    FootnotesSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getFootnotesSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFootnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(FootnotesSettings = FootnotesSettings, acquire = acquire, getFootnotesSettings = getFootnotesSettings, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFootnotesSettingsSupplier]
  }
}

