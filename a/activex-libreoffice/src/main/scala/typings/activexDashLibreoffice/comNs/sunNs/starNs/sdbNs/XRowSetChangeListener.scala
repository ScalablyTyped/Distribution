package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by components which want to be notified when the `RowSet` supplied by a {@link XRowSetSupplier} changes.
  * @see XRowSetChangeBroadcaster
  * @see XRowSetSupplier
  * @since OOo 3.2
  */
trait XRowSetChangeListener extends XEventListener {
  /** notifies the listener that the `RowSet` associated with a {@link XRowSetSupplier} has changed. */
  def onRowSetChanged(iEvent: EventObject): Unit
}

object XRowSetChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    onRowSetChanged: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRowSetChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), onRowSetChanged = js.Any.fromFunction1(onRowSetChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRowSetChangeListener]
  }
}

