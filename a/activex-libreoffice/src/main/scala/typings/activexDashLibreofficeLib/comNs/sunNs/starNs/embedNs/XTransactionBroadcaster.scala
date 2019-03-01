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
    acquire: js.Function0[scala.Unit],
    addTransactionListener: js.Function1[XTransactionListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTransactionListener: js.Function1[XTransactionListener, scala.Unit]
  ): XTransactionBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addTransactionListener")(addTransactionListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTransactionListener")(removeTransactionListener)
    __obj.asInstanceOf[XTransactionBroadcaster]
  }
}

