package typings.activexLibreoffice.com_.sun.star.sdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowsChangeListener
  * @since OOo 3.3
  */
trait XRowsChangeBroadcaster extends js.Object {
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowsChangeListener(listener: XRowsChangeListener): Unit
  /** removes a previously added listener. */
  def removeRowsChangeListener(listener: XRowsChangeListener): Unit
}

object XRowsChangeBroadcaster {
  @scala.inline
  def apply(
    addRowsChangeListener: XRowsChangeListener => Unit,
    removeRowsChangeListener: XRowsChangeListener => Unit
  ): XRowsChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowsChangeListener = js.Any.fromFunction1(addRowsChangeListener), removeRowsChangeListener = js.Any.fromFunction1(removeRowsChangeListener))
    __obj.asInstanceOf[XRowsChangeBroadcaster]
  }
}

