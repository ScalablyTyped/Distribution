package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait ModuleAcceleratorConfiguration extends XAcceleratorConfiguration {
  def createWithModuleIdentifier(ModuleIdentifier: java.lang.String): scala.Unit
}

object ModuleAcceleratorConfiguration {
  @scala.inline
  def apply(
    AllKeyEvents: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent],
    acquire: () => scala.Unit,
    addConfigurationListener: XUIConfigurationListener => scala.Unit,
    createWithModuleIdentifier: java.lang.String => scala.Unit,
    getAllKeyEvents: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent],
    getCommandByKeyEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent => java.lang.String,
    getKeyEventsByCommand: java.lang.String => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent],
    getPreferredKeyEventsForCommandList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[_],
    hasStorage: () => scala.Boolean,
    isModified: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reload: () => scala.Unit,
    removeCommandFromAllKeyEvents: java.lang.String => scala.Unit,
    removeConfigurationListener: XUIConfigurationListener => scala.Unit,
    removeKeyEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent => scala.Unit,
    setKeyEvent: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, java.lang.String) => scala.Unit,
    setStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit,
    store: () => scala.Unit,
    storeToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): ModuleAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal(AllKeyEvents = AllKeyEvents, acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createWithModuleIdentifier = js.Any.fromFunction1(createWithModuleIdentifier), getAllKeyEvents = js.Any.fromFunction0(getAllKeyEvents), getCommandByKeyEvent = js.Any.fromFunction1(getCommandByKeyEvent), getKeyEventsByCommand = js.Any.fromFunction1(getKeyEventsByCommand), getPreferredKeyEventsForCommandList = js.Any.fromFunction1(getPreferredKeyEventsForCommandList), hasStorage = js.Any.fromFunction0(hasStorage), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeCommandFromAllKeyEvents = js.Any.fromFunction1(removeCommandFromAllKeyEvents), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeKeyEvent = js.Any.fromFunction1(removeKeyEvent), setKeyEvent = js.Any.fromFunction2(setKeyEvent), setStorage = js.Any.fromFunction1(setStorage), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[ModuleAcceleratorConfiguration]
  }
}

