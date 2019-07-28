package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XPrintSettingsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XViewSettingsSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a service that provides access to the settings of a text module. */
trait GlobalSettings
  extends XPrintSettingsSupplier
     with XViewSettingsSupplier

object GlobalSettings {
  @scala.inline
  def apply(
    PrintSettings: XPropertySet,
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    getPrintSettings: () => XPropertySet,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): GlobalSettings = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings, ViewSettings = ViewSettings, acquire = js.Any.fromFunction0(acquire), getPrintSettings = js.Any.fromFunction0(getPrintSettings), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[GlobalSettings]
  }
}

