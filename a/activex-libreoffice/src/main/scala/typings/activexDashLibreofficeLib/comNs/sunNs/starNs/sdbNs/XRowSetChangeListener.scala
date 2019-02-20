package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by components which want to be notified when the `RowSet` supplied by a {@link XRowSetSupplier} changes.
  * @see XRowSetChangeBroadcaster
  * @see XRowSetSupplier
  * @since OOo 3.2
  */
trait XRowSetChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** notifies the listener that the `RowSet` associated with a {@link XRowSetSupplier} has changed. */
  def onRowSetChanged(iEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

