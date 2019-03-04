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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addMenuProxyListener: js.Function1[XMenuProxyListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    executeMenuItem: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeMenuProxyListener: js.Function1[XMenuProxyListener, scala.Unit]
  ): XMenuProxy = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, addMenuProxyListener = addMenuProxyListener, dispose = dispose, executeMenuItem = executeMenuItem, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeMenuProxyListener = removeMenuProxyListener)
  
    __obj.asInstanceOf[XMenuProxy]
  }
}

