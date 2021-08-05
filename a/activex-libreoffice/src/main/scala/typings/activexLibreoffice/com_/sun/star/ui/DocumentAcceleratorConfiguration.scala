package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.2 */
trait DocumentAcceleratorConfiguration
  extends StObject
     with XAcceleratorConfiguration {
  
  def createWithDocumentRoot(DocumentRoot: XStorage): Unit
}
object DocumentAcceleratorConfiguration {
  
  inline def apply(
    AllKeyEvents: SafeArray[KeyEvent],
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    createWithDocumentRoot: XStorage => Unit,
    getAllKeyEvents: () => SafeArray[KeyEvent],
    getCommandByKeyEvent: KeyEvent => String,
    getKeyEventsByCommand: String => SafeArray[KeyEvent],
    getPreferredKeyEventsForCommandList: SeqEquiv[String] => SafeArray[js.Any],
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
  ): DocumentAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal(AllKeyEvents = AllKeyEvents.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), createWithDocumentRoot = js.Any.fromFunction1(createWithDocumentRoot), getAllKeyEvents = js.Any.fromFunction0(getAllKeyEvents), getCommandByKeyEvent = js.Any.fromFunction1(getCommandByKeyEvent), getKeyEventsByCommand = js.Any.fromFunction1(getKeyEventsByCommand), getPreferredKeyEventsForCommandList = js.Any.fromFunction1(getPreferredKeyEventsForCommandList), hasStorage = js.Any.fromFunction0(hasStorage), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeCommandFromAllKeyEvents = js.Any.fromFunction1(removeCommandFromAllKeyEvents), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeKeyEvent = js.Any.fromFunction1(removeKeyEvent), setKeyEvent = js.Any.fromFunction2(setKeyEvent), setStorage = js.Any.fromFunction1(setStorage), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
    __obj.asInstanceOf[DocumentAcceleratorConfiguration]
  }
  
  extension [Self <: DocumentAcceleratorConfiguration](x: Self) {
    
    inline def setCreateWithDocumentRoot(value: XStorage => Unit): Self = StObject.set(x, "createWithDocumentRoot", js.Any.fromFunction1(value))
  }
}
