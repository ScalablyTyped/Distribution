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
    acquire: js.Function0[scala.Unit],
    addConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    createDefault: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    createSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    getDefaultSettings: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
    ],
    getEventsManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getImageManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getSettings: js.Function2[
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
    ],
    getShortCutManager: js.Function0[XAcceleratorConfiguration],
    getUIElementsInfo: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    hasSettings: js.Function1[java.lang.String, scala.Boolean],
    insertSettings: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Unit
    ],
    isDefaultSettings: js.Function1[java.lang.String, scala.Boolean],
    isModified: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function0[scala.Unit],
    removeConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    removeSettings: js.Function1[java.lang.String, scala.Unit],
    replaceSettings: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Unit
    ],
    reset: js.Function0[scala.Unit],
    store: js.Function0[scala.Unit],
    storeToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): ModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventsManager")(EventsManager)
    __obj.updateDynamic("ImageManager")(ImageManager)
    __obj.updateDynamic("ShortCutManager")(ShortCutManager)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addConfigurationListener")(addConfigurationListener)
    __obj.updateDynamic("createDefault")(createDefault)
    __obj.updateDynamic("createSettings")(createSettings)
    __obj.updateDynamic("getDefaultSettings")(getDefaultSettings)
    __obj.updateDynamic("getEventsManager")(getEventsManager)
    __obj.updateDynamic("getImageManager")(getImageManager)
    __obj.updateDynamic("getSettings")(getSettings)
    __obj.updateDynamic("getShortCutManager")(getShortCutManager)
    __obj.updateDynamic("getUIElementsInfo")(getUIElementsInfo)
    __obj.updateDynamic("hasSettings")(hasSettings)
    __obj.updateDynamic("insertSettings")(insertSettings)
    __obj.updateDynamic("isDefaultSettings")(isDefaultSettings)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reload")(reload)
    __obj.updateDynamic("removeConfigurationListener")(removeConfigurationListener)
    __obj.updateDynamic("removeSettings")(removeSettings)
    __obj.updateDynamic("replaceSettings")(replaceSettings)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.asInstanceOf[ModuleUIConfigurationManager]
  }
}

