package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowSetChangeListener
  * @since OOo 3.2
  */
trait XRowSetChangeBroadcaster extends js.Object {
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowSetChangeListener(iListener: XRowSetChangeListener): Unit
  /** removes a previously added listener. */
  def removeRowSetChangeListener(iListener: XRowSetChangeListener): Unit
}

object XRowSetChangeBroadcaster {
  @scala.inline
  def apply(
    addRowSetChangeListener: XRowSetChangeListener => Unit,
    removeRowSetChangeListener: XRowSetChangeListener => Unit
  ): XRowSetChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowSetChangeListener = js.Any.fromFunction1(addRowSetChangeListener), removeRowSetChangeListener = js.Any.fromFunction1(removeRowSetChangeListener))
  
    __obj.asInstanceOf[XRowSetChangeBroadcaster]
  }
}

