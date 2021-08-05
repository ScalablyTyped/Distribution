package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.view.XPrintSettingsSupplier
import typings.activexLibreoffice.com_.sun.star.view.XViewSettingsSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a service that provides access to the settings of a text module. */
trait GlobalSettings
  extends StObject
     with XPrintSettingsSupplier
     with XViewSettingsSupplier
object GlobalSettings {
  
  inline def apply(
    PrintSettings: XPropertySet,
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    getPrintSettings: () => XPropertySet,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): GlobalSettings = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrintSettings = js.Any.fromFunction0(getPrintSettings), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[GlobalSettings]
  }
}
