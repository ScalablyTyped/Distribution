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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventsManager")(EventsManager)
    __obj.updateDynamic("ImageManager")(ImageManager)
    __obj.updateDynamic("ShortCutManager")(ShortCutManager)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addConfigurationListener")(addConfigurationListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("createSettings")(createSettings)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getEventsManager")(getEventsManager)
    __obj.updateDynamic("getImageManager")(getImageManager)
    __obj.updateDynamic("getSettings")(getSettings)
    __obj.updateDynamic("getShortCutManager")(getShortCutManager)
    __obj.updateDynamic("getUIElementsInfo")(getUIElementsInfo)
    __obj.updateDynamic("hasSettings")(hasSettings)
    __obj.updateDynamic("hasStorage")(hasStorage)
    __obj.updateDynamic("insertSettings")(insertSettings)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reload")(reload)
    __obj.updateDynamic("removeConfigurationListener")(removeConfigurationListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeSettings")(removeSettings)
    __obj.updateDynamic("replaceSettings")(replaceSettings)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("setStorage")(setStorage)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.asInstanceOf[XUIConfigurationManager2]
  }
}

