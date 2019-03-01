package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link FootnoteSettings} within the context (e.g. document). */
trait XEndnotesSettingsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns {@link EndnoteSettings} of the object. */
  val EndnotesSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns {@link EndnoteSettings} of the object. */
  def getEndnotesSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XEndnotesSettingsSupplier {
  @scala.inline
  def apply(
    EndnotesSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getEndnotesSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEndnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndnotesSettings")(EndnotesSettings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getEndnotesSettings")(getEndnotesSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XEndnotesSettingsSupplier]
  }
}

