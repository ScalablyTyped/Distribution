package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to execute dispatch for a menu item and handles listeners for changes in menu items. */
trait XMenuProxy extends XComponent {
  /**
    * Registers an event listener, which will be called when the menu changes
    * @param xListener [in]: the listener to be set
    */
  def addMenuProxyListener(xListener: XMenuProxyListener): Unit
  /**
    * Executes dispatch for the given menu id
    * @param ID [in]: the menu item
    */
  def executeMenuItem(ID: Double): Unit
  /**
    * Unregisters an event listener which was registered with {@link XMenuProxy.addMenuProxyListener()} .
    * @param xListener [in]: the listener to be removed
    */
  def removeMenuProxyListener(xListener: XMenuProxyListener): Unit
}

object XMenuProxy {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addMenuProxyListener: XMenuProxyListener => Unit,
    dispose: () => Unit,
    executeMenuItem: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeMenuProxyListener: XMenuProxyListener => Unit
  ): XMenuProxy = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addMenuProxyListener = js.Any.fromFunction1(addMenuProxyListener), dispose = js.Any.fromFunction0(dispose), executeMenuItem = js.Any.fromFunction1(executeMenuItem), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeMenuProxyListener = js.Any.fromFunction1(removeMenuProxyListener))
    __obj.asInstanceOf[XMenuProxy]
  }
}

