package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** registers item listeners at controls like the com::sun::star::awt::Roadmap */
trait XItemEventBroadcaster extends XInterface {
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
}

object XItemEventBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit
  ): XItemEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener))
  
    __obj.asInstanceOf[XItemEventBroadcaster]
  }
}

