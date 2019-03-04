package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for approving the moving and changing of row set actions. */
trait XRowSetApproveListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called before a row set's cursor is moved.
    * @param event the event which happened
    * @returns `TRUE` when moving is allowed, otherwise `FALSE`
    */
  def approveCursorMove(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
  /**
    * is called before a row is inserted, updated, or deleted.
    * @param event the event which happened
    * @returns `TRUE` when changing is allowed, otherwise `FALSE`
    */
  def approveRowChange(event: RowChangeEvent): scala.Boolean
  /**
    * is called before a row set is changed, or in other words before a row set is reexecuted.
    * @param event the event which happened
    * @returns `TRUE` when changing is allowed, otherwise `FALSE`
    */
  def approveRowSetChange(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
}

object XRowSetApproveListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveCursorMove: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    approveRowChange: js.Function1[RowChangeEvent, scala.Boolean],
    approveRowSetChange: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRowSetApproveListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, approveCursorMove = approveCursorMove, approveRowChange = approveRowChange, approveRowSetChange = approveRowSetChange, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XRowSetApproveListener]
  }
}

