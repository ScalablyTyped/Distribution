package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to execute dispatch for a menu item and handles listeners for changes in menu items. */
trait XMenuProxy
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * Registers an event listener, which will be called when the menu changes
    * @param xListener [in]: the listener to be set
    */
  def addMenuProxyListener(xListener: XMenuProxyListener): scala.Unit
  /**
    * Executes dispatch for the given menu id
    * @param ID [in]: the menu item
    */
  def executeMenuItem(ID: scala.Double): scala.Unit
  /**
    * Unregisters an event listener which was registered with {@link XMenuProxy.addMenuProxyListener()} .
    * @param xListener [in]: the listener to be removed
    */
  def removeMenuProxyListener(xListener: XMenuProxyListener): scala.Unit
}

object XMenuProxy {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addMenuProxyListener: XMenuProxyListener => scala.Unit,
    dispose: () => scala.Unit,
    executeMenuItem: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeMenuProxyListener: XMenuProxyListener => scala.Unit
  ): XMenuProxy = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addMenuProxyListener = js.Any.fromFunction1(addMenuProxyListener), dispose = js.Any.fromFunction0(dispose), executeMenuItem = js.Any.fromFunction1(executeMenuItem), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeMenuProxyListener = js.Any.fromFunction1(removeMenuProxyListener))
  
    __obj.asInstanceOf[XMenuProxy]
  }
}

