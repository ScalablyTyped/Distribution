package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link ModuleUIConfigurationManager} service.
  * @since LibreOffice 4.2
  */
trait XModuleUIConfigurationManager2
  extends XUIConfigurationPersistence
     with XUIConfigurationManager
     with XModuleUIConfigurationManager
     with XUIConfiguration

object XModuleUIConfigurationManager2 {
  @scala.inline
  def apply(
    EventsManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ImageManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => scala.Unit,
    addConfigurationListener: XUIConfigurationListener => scala.Unit,
    createSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    getDefaultSettings: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getEventsManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getImageManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getSettings: (java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getShortCutManager: () => XAcceleratorConfiguration,
    getUIElementsInfo: scala.Double => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    hasSettings: java.lang.String => scala.Boolean,
    insertSettings: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess) => scala.Unit,
    isDefaultSettings: java.lang.String => scala.Boolean,
    isModified: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reload: () => scala.Unit,
    removeConfigurationListener: XUIConfigurationListener => scala.Unit,
    removeSettings: java.lang.String => scala.Unit,
    replaceSettings: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess) => scala.Unit,
    reset: () => scala.Unit,
    store: () => scala.Unit,
    storeToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XModuleUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager, ImageManager = ImageManager, ShortCutManager = ShortCutManager, acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createSettings = js.Any.fromFunction0(createSettings), getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2(insertSettings), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[XModuleUIConfigurationManager2]
  }
}

