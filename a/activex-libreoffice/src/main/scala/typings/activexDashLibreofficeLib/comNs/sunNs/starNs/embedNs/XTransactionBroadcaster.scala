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

