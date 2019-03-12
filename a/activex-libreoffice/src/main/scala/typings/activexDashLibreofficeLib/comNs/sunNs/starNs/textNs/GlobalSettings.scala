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
    acquire: () => scala.Unit,
    getPrintSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getViewSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): GlobalSettings = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings, ViewSettings = ViewSettings, acquire = js.Any.fromFunction0(acquire), getPrintSettings = js.Any.fromFunction0(getPrintSettings), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[GlobalSettings]
  }
}

