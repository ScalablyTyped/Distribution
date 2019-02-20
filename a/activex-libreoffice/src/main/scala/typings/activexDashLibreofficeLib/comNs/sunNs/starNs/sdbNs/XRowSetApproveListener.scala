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

