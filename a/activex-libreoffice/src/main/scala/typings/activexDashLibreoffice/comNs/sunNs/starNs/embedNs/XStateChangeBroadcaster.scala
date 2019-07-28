package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** broadcasts message in case embedded object object changes it's state. */
trait XStateChangeBroadcaster extends XInterface {
  /** adds the specified listener to receive events about states change */
  def addStateChangeListener(xListener: XStateChangeListener): Unit
  /** removes the specified listener */
  def removeStateChangeListener(xListener: XStateChangeListener): Unit
}

object XStateChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addStateChangeListener: XStateChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStateChangeListener: XStateChangeListener => Unit
  ): XStateChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStateChangeListener = js.Any.fromFunction1(addStateChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStateChangeListener = js.Any.fromFunction1(removeStateChangeListener))
  
    __obj.asInstanceOf[XStateChangeBroadcaster]
  }
}

