package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a service that provides access to the settings of a text module. */
trait GlobalSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XPrintSettingsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XViewSettingsSupplier

object GlobalSettings {
  @scala.inline
  def apply(
    PrintSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ViewSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getPrintSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getViewSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): GlobalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PrintSettings")(PrintSettings)
    __obj.updateDynamic("ViewSettings")(ViewSettings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPrintSettings")(getPrintSettings)
    __obj.updateDynamic("getViewSettings")(getViewSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[GlobalSettings]
  }
}

