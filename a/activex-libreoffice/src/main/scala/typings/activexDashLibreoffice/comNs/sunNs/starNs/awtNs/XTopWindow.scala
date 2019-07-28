package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages the functionality specific for a top window. */
trait XTopWindow extends XInterface {
  /** adds the specified top window listener to receive window events from this window. */
  def addTopWindowListener(xListener: XTopWindowListener): Unit
  /** removes the specified top window listener so that it no longer receives window events from this window. */
  def removeTopWindowListener(xListener: XTopWindowListener): Unit
  /** sets a menu bar. */
  def setMenuBar(xMenu: XMenuBar): Unit
  /** places this window at the bottom of the stacking order and makes the corresponding adjustment to other visible windows. */
  def toBack(): Unit
  /** places this window at the top of the stacking order and shows it in front of any other windows. */
  def toFront(): Unit
}

object XTopWindow {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    setMenuBar: XMenuBar => Unit,
    toBack: () => Unit,
    toFront: () => Unit
  ): XTopWindow = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), setMenuBar = js.Any.fromFunction1(setMenuBar), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
  
    __obj.asInstanceOf[XTopWindow]
  }
}

