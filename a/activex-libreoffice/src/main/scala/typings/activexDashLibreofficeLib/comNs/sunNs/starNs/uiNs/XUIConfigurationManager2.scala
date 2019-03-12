package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XUIConfigurationManager2
  extends XUIConfigurationStorage
     with XUIConfigurationPersistence
     with XUIConfigurationManager
     with XUIConfiguration
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object XUIConfigurationManager2 {
  @scala.inline
  def apply(
    EventsManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ImageManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => scala.Unit,
    addConfigurationListener: XUIConfigurationListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    createSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    dispose: () => scala.Unit,
    getEventsManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getImageManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getSettings: (java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getShortCutManager: () => XAcceleratorConfiguration,
    getUIElementsInfo: scala.Double => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    hasSettings: java.lang.String => scala.Boolean,
    hasStorage: () => scala.Boolean,
    insertSettings: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess) => scala.Unit,
    isModified: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reload: () => scala.Unit,
    removeConfigurationListener: XUIConfigurationListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeSettings: java.lang.String => scala.Unit,
    replaceSettings: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess) => scala.Unit,
    reset: () => scala.Unit,
    setStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit,
    store: () => scala.Unit,
    storeToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager, ImageManager = ImageManager, ShortCutManager = ShortCutManager, acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), addEventListener = js.Any.fromFunction1(addEventListener), createSettings = js.Any.fromFunction0(createSettings), dispose = js.Any.fromFunction0(dispose), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), hasStorage = js.Any.fromFunction0(hasStorage), insertSettings = js.Any.fromFunction2(insertSettings), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset), setStorage = js.Any.fromFunction1(setStorage), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[XUIConfigurationManager2]
  }
}

