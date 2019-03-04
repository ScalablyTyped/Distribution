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
    acquire: js.Function0[scala.Unit],
    addConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    createSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    dispose: js.Function0[scala.Unit],
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
    hasStorage: js.Function0[scala.Boolean],
    insertSettings: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Unit
    ],
    isModified: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function0[scala.Unit],
    removeConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeSettings: js.Function1[java.lang.String, scala.Unit],
    replaceSettings: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Unit
    ],
    reset: js.Function0[scala.Unit],
    setStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    store: js.Function0[scala.Unit],
    storeToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): XUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager, ImageManager = ImageManager, ShortCutManager = ShortCutManager, acquire = acquire, addConfigurationListener = addConfigurationListener, addEventListener = addEventListener, createSettings = createSettings, dispose = dispose, getEventsManager = getEventsManager, getImageManager = getImageManager, getSettings = getSettings, getShortCutManager = getShortCutManager, getUIElementsInfo = getUIElementsInfo, hasSettings = hasSettings, hasStorage = hasStorage, insertSettings = insertSettings, isModified = isModified, isReadOnly = isReadOnly, queryInterface = queryInterface, release = release, reload = reload, removeConfigurationListener = removeConfigurationListener, removeEventListener = removeEventListener, removeSettings = removeSettings, replaceSettings = replaceSettings, reset = reset, setStorage = setStorage, store = store, storeToStorage = storeToStorage)
  
    __obj.asInstanceOf[XUIConfigurationManager2]
  }
}

