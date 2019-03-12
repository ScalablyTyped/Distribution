package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** broadcasts message in case transacted object is committed or reverted. */
trait XTransactionBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive events about commits and reverts. */
  def addTransactionListener(aListener: XTransactionListener): scala.Unit
  /** removes the specified listener. */
  def removeTransactionListener(aListener: XTransactionListener): scala.Unit
}

object XTransactionBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addTransactionListener: XTransactionListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTransactionListener: XTransactionListener => scala.Unit
  ): XTransactionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTransactionListener = js.Any.fromFunction1(addTransactionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener))
  
    __obj.asInstanceOf[XTransactionBroadcaster]
  }
}

