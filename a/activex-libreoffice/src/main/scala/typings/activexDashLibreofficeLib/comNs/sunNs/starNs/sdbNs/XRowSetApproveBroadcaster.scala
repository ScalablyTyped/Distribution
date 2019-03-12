package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the possibility of reviving an event before changing the content of a row set. */
trait XRowSetApproveBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive the events "approveCursorMove", "approveRowChange", and "appproveRowSetChange". */
  def addRowSetApproveListener(listener: XRowSetApproveListener): scala.Unit
  /** removes the specified listener. */
  def removeRowSetApproveListener(listener: XRowSetApproveListener): scala.Unit
}

object XRowSetApproveBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addRowSetApproveListener: XRowSetApproveListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeRowSetApproveListener: XRowSetApproveListener => scala.Unit
  ): XRowSetApproveBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener))
  
    __obj.asInstanceOf[XRowSetApproveBroadcaster]
  }
}

