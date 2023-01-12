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
  * specifies a user interface configuration manager which gives access to user interface configuration data of a module.
  *
  * A module user interface configuration manager supports two layers of configuration settings data: ;  1. Layer: A module default user interface
  * configuration which describe all user interface elements settings that are used by OpenOffice. It is not possible to insert, remove or change elements
  * settings in this layer through the interfaces. ;  2. Layer: A module user interface configuration which only contains customized user interface
  * elements and user-defined ones. All changes on user interface element settings are done on this layer.
  * @since OOo 2.0
  */
trait ModuleUIConfigurationManager
  extends StObject
     with XModuleUIConfigurationManager2 {
  
  /**
    * provides a function to initialize a module user interface configuration manager instance.
    *
    * A module user interface configuration manager instance needs the following arguments as {@link com.sun.star.beans.PropertyValue} to be in a working
    * state: **DefaultConfigStorage** a reference to a {@link com.sun.star.embed.Storage} that contains the default module user interface configuration
    * settings.**UserConfigStorage** a reference to a {@link com.sun.star.embed.Storage} that contains the user-defined module user interface configuration
    * settings.**ModuleIdentifier** string that provides the module identifier.**UserRootCommit** a reference to a {@link
    * com.sun.star.embed.XTransactedObject} which represents the customizable root storage. Every implementation must use this reference to commit its
    * changes also at the root storage. A non-initialized module user interface configuration manager cannot be used, it is treated as a read-only
    * container.
    */
  def createDefault(ModuleShortName: String, ModuleIdentifier: String): Unit
}
object ModuleUIConfigurationManager {
  
  inline def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    createDefault: (String, String) => Unit,
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
    queryInterface: `type` => Any,
    release: () => Unit,
    reload: () => Unit,
    removeConfigurationListener: XUIConfigurationListener => Unit,
    removeSettings: String => Unit,
    replaceSettings: (String, XIndexAccess) => Unit,
    reset: () => Unit,
    store: () => Unit,
    storeToStorage: XStorage => Unit
  ): ModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createDefault = js.Any.fromFunction2(createDefault), createSettings = js.Any.fromFunction0(createSettings), getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2(insertSettings), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
    __obj.asInstanceOf[ModuleUIConfigurationManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleUIConfigurationManager] (val x: Self) extends AnyVal {
    
    inline def setCreateDefault(value: (String, String) => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction2(value))
  }
}
