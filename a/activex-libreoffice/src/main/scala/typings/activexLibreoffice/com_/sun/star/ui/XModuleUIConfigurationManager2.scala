package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link ModuleUIConfigurationManager} service.
  * @since LibreOffice 4.2
  */
trait XModuleUIConfigurationManager2
  extends StObject
     with XUIConfigurationPersistence
     with XUIConfigurationManager
     with XModuleUIConfigurationManager
     with XUIConfiguration
object XModuleUIConfigurationManager2 {
  
  @scala.inline
  def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    createSettings: () => XIndexContainer,
    getDefaultSettings: String => XIndexAccess,
    getEventsManager: () => XInterface,
    getImageManager: () => XInterface,
    getSettings: (String, Boolean) => XIndexAccess,
    getShortCutManager: () => XAcceleratorConfiguration,
    getUIElementsInfo: Double => SafeArray[SafeArray[PropertyValue]],
    hasSettings: String => Boolean,
    insertSettings: (String, XIndexAccess) => Unit,
    isDefaultSettings: String => Boolean,
    isModified: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    removeConfigurationListener: XUIConfigurationListener => Unit,
    removeSettings: String => Unit,
    replaceSettings: (String, XIndexAccess) => Unit,
    reset: () => Unit,
    store: () => Unit,
    storeToStorage: XStorage => Unit
  ): XModuleUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createSettings = js.Any.fromFunction0(createSettings), getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2(insertSettings), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
    __obj.asInstanceOf[XModuleUIConfigurationManager2]
  }
}
