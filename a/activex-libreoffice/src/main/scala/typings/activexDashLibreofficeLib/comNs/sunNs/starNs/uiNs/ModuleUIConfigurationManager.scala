package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a user interface configuration manager which gives access to user interface configuration data of a module.
  *
  * A module user interface configuration manager supports two layers of configuration settings data: ;  1. Layer: A module default user interface
  * configuration which describe all user interface elements settings that are used by OpenOffice. It is not possible to insert, remove or change elements
  * settings in this layer through the interfaces. ;  2. Layer: A module user interface configuration which only contains customized user interface
  * elements and user-defined ones. All changes on user interface element settings are done on this layer.
  * @since OOo 2.0
  */
trait ModuleUIConfigurationManager extends XModuleUIConfigurationManager2 {
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
  def createDefault(ModuleShortName: java.lang.String, ModuleIdentifier: java.lang.String): scala.Unit
}

object ModuleUIConfigurationManager {
  @scala.inline
  def apply(
    EventsManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ImageManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => scala.Unit,
    addConfigurationListener: XUIConfigurationListener => scala.Unit,
    createDefault: (java.lang.String, java.lang.String) => scala.Unit,
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
  ): ModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager, ImageManager = ImageManager, ShortCutManager = ShortCutManager, acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createDefault = js.Any.fromFunction2(createDefault), createSettings = js.Any.fromFunction0(createSettings), getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2(insertSettings), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[ModuleUIConfigurationManager]
  }
}

