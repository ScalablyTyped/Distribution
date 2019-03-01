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
    acquire: js.Function0[scala.Unit],
    addRowSetApproveListener: js.Function1[XRowSetApproveListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeRowSetApproveListener: js.Function1[XRowSetApproveListener, scala.Unit]
  ): XRowSetApproveBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addRowSetApproveListener")(addRowSetApproveListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeRowSetApproveListener")(removeRowSetApproveListener)
    __obj.asInstanceOf[XRowSetApproveBroadcaster]
  }
}

