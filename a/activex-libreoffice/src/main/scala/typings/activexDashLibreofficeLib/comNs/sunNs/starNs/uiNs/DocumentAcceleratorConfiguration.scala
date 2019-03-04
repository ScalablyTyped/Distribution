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
    val __obj = js.Dynamic.literal(AllKeyEvents = AllKeyEvents, acquire = acquire, addConfigurationListener = addConfigurationListener, createWithDocumentRoot = createWithDocumentRoot, getAllKeyEvents = getAllKeyEvents, getCommandByKeyEvent = getCommandByKeyEvent, getKeyEventsByCommand = getKeyEventsByCommand, getPreferredKeyEventsForCommandList = getPreferredKeyEventsForCommandList, hasStorage = hasStorage, isModified = isModified, isReadOnly = isReadOnly, queryInterface = queryInterface, release = release, reload = reload, removeCommandFromAllKeyEvents = removeCommandFromAllKeyEvents, removeConfigurationListener = removeConfigurationListener, removeKeyEvent = removeKeyEvent, setKeyEvent = setKeyEvent, setStorage = setStorage, store = store, storeToStorage = storeToStorage)
  
    __obj.asInstanceOf[DocumentAcceleratorConfiguration]
  }
}

