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
    acquire: js.Function0[scala.Unit],
    addConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
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
  ): XModuleUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager, ImageManager = ImageManager, ShortCutManager = ShortCutManager, acquire = acquire, addConfigurationListener = addConfigurationListener, createSettings = createSettings, getDefaultSettings = getDefaultSettings, getEventsManager = getEventsManager, getImageManager = getImageManager, getSettings = getSettings, getShortCutManager = getShortCutManager, getUIElementsInfo = getUIElementsInfo, hasSettings = hasSettings, insertSettings = insertSettings, isDefaultSettings = isDefaultSettings, isModified = isModified, isReadOnly = isReadOnly, queryInterface = queryInterface, release = release, reload = reload, removeConfigurationListener = removeConfigurationListener, removeSettings = removeSettings, replaceSettings = replaceSettings, reset = reset, store = store, storeToStorage = storeToStorage)
  
    __obj.asInstanceOf[XModuleUIConfigurationManager2]
  }
}

