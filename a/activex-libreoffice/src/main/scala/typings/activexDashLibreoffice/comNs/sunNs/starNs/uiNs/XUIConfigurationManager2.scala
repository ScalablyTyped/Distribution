package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XUIConfigurationManager2
  extends XUIConfigurationStorage
     with XUIConfigurationPersistence
     with XUIConfigurationManager
     with XUIConfiguration
     with XComponent

object XUIConfigurationManager2 {
  @scala.inline
  def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    addEventListener: XEventListener => Unit,
    createSettings: () => XIndexContainer,
    dispose: () => Unit,
    getEventsManager: () => XInterface,
    getImageManager: () => XInterface,
    getSettings: (String, Boolean) => XIndexAccess,
    getShortCutManager: () => XAcceleratorConfiguration,
    getUIElementsInfo: Double => SafeArray[SafeArray[PropertyValue]],
    hasSettings: String => Boolean,
    hasStorage: () => Boolean,
    insertSettings: (String, XIndexAccess) => Unit,
    isModified: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    removeConfigurationListener: XUIConfigurationListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeSettings: String => Unit,
    replaceSettings: (String, XIndexAccess) => Unit,
    reset: () => Unit,
    setStorage: XStorage => Unit,
    store: () => Unit,
    storeToStorage: XStorage => Unit
  ): XUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager, ImageManager = ImageManager, ShortCutManager = ShortCutManager, acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), addEventListener = js.Any.fromFunction1(addEventListener), createSettings = js.Any.fromFunction0(createSettings), dispose = js.Any.fromFunction0(dispose), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), hasStorage = js.Any.fromFunction0(hasStorage), insertSettings = js.Any.fromFunction2(insertSettings), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset), setStorage = js.Any.fromFunction1(setStorage), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[XUIConfigurationManager2]
  }
}

