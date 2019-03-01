package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait DocumentAcceleratorConfiguration extends XAcceleratorConfiguration {
  def createWithDocumentRoot(DocumentRoot: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object DocumentAcceleratorConfiguration {
  @scala.inline
  def apply(
    AllKeyEvents: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent],
    acquire: js.Function0[scala.Unit],
    addConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    createWithDocumentRoot: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    getAllKeyEvents: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
    ],
    getCommandByKeyEvent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, java.lang.String],
    getKeyEventsByCommand: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
    ],
    getPreferredKeyEventsForCommandList: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    hasStorage: js.Function0[scala.Boolean],
    isModified: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function0[scala.Unit],
    removeCommandFromAllKeyEvents: js.Function1[java.lang.String, scala.Unit],
    removeConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    removeKeyEvent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, scala.Unit],
    setKeyEvent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, 
      java.lang.String, 
      scala.Unit
    ],
    setStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    store: js.Function0[scala.Unit],
    storeToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): DocumentAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllKeyEvents")(AllKeyEvents)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addConfigurationListener")(addConfigurationListener)
    __obj.updateDynamic("createWithDocumentRoot")(createWithDocumentRoot)
    __obj.updateDynamic("getAllKeyEvents")(getAllKeyEvents)
    __obj.updateDynamic("getCommandByKeyEvent")(getCommandByKeyEvent)
    __obj.updateDynamic("getKeyEventsByCommand")(getKeyEventsByCommand)
    __obj.updateDynamic("getPreferredKeyEventsForCommandList")(getPreferredKeyEventsForCommandList)
    __obj.updateDynamic("hasStorage")(hasStorage)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reload")(reload)
    __obj.updateDynamic("removeCommandFromAllKeyEvents")(removeCommandFromAllKeyEvents)
    __obj.updateDynamic("removeConfigurationListener")(removeConfigurationListener)
    __obj.updateDynamic("removeKeyEvent")(removeKeyEvent)
    __obj.updateDynamic("setKeyEvent")(setKeyEvent)
    __obj.updateDynamic("setStorage")(setStorage)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.asInstanceOf[DocumentAcceleratorConfiguration]
  }
}

