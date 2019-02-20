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

