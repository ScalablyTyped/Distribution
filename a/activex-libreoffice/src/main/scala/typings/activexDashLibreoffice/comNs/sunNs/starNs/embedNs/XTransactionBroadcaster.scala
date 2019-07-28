package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** broadcasts message in case transacted object is committed or reverted. */
trait XTransactionBroadcaster extends XInterface {
  /** adds the specified listener to receive events about commits and reverts. */
  def addTransactionListener(aListener: XTransactionListener): Unit
  /** removes the specified listener. */
  def removeTransactionListener(aListener: XTransactionListener): Unit
}

object XTransactionBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addTransactionListener: XTransactionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTransactionListener: XTransactionListener => Unit
  ): XTransactionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTransactionListener = js.Any.fromFunction1(addTransactionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener))
  
    __obj.asInstanceOf[XTransactionBroadcaster]
  }
}

