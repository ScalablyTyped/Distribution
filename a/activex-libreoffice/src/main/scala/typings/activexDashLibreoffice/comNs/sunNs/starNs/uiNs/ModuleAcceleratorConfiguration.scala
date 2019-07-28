package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.KeyEvent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait ModuleAcceleratorConfiguration extends XAcceleratorConfiguration {
  def createWithModuleIdentifier(ModuleIdentifier: String): Unit
}

object ModuleAcceleratorConfiguration {
  @scala.inline
  def apply(
    AllKeyEvents: SafeArray[KeyEvent],
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    createWithModuleIdentifier: String => Unit,
    getAllKeyEvents: () => SafeArray[KeyEvent],
    getCommandByKeyEvent: KeyEvent => String,
    getKeyEventsByCommand: String => SafeArray[KeyEvent],
    getPreferredKeyEventsForCommandList: SeqEquiv[String] => SafeArray[_],
    hasStorage: () => Boolean,
    isModified: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    removeCommandFromAllKeyEvents: String => Unit,
    removeConfigurationListener: XUIConfigurationListener => Unit,
    removeKeyEvent: KeyEvent => Unit,
    setKeyEvent: (KeyEvent, String) => Unit,
    setStorage: XStorage => Unit,
    store: () => Unit,
    storeToStorage: XStorage => Unit
  ): ModuleAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal(AllKeyEvents = AllKeyEvents, acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createWithModuleIdentifier = js.Any.fromFunction1(createWithModuleIdentifier), getAllKeyEvents = js.Any.fromFunction0(getAllKeyEvents), getCommandByKeyEvent = js.Any.fromFunction1(getCommandByKeyEvent), getKeyEventsByCommand = js.Any.fromFunction1(getKeyEventsByCommand), getPreferredKeyEventsForCommandList = js.Any.fromFunction1(getPreferredKeyEventsForCommandList), hasStorage = js.Any.fromFunction0(hasStorage), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeCommandFromAllKeyEvents = js.Any.fromFunction1(removeCommandFromAllKeyEvents), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeKeyEvent = js.Any.fromFunction1(removeKeyEvent), setKeyEvent = js.Any.fromFunction2(setKeyEvent), setStorage = js.Any.fromFunction1(setStorage), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[ModuleAcceleratorConfiguration]
  }
}

