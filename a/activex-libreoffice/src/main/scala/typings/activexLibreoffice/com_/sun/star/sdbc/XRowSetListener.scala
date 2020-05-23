package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for receiving "cursorMoved", "rowChanged", and "rowSetChanged" events posted by, for example, a row set. */
trait XRowSetListener extends XEventListener {
  /**
    * is called when a row set's cursor is moved.
    * @param event contains information about the event
    */
  def cursorMoved(event: EventObject): Unit
  /**
    * is called when a row is inserted, updated, or deleted.
    * @deprecated Deprecated
    * @param event contains information about the event
    * @see com.sun.star.sdb.XRowsChangeListener
    */
  def rowChanged(event: EventObject): Unit
  /**
    * is called when the row set has changed, or in other words, when the row set has been reexecuted.
    * @param event contains information about the event
    */
  def rowSetChanged(event: EventObject): Unit
}

object XRowSetListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cursorMoved: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    rowChanged: EventObject => Unit,
    rowSetChanged: EventObject => Unit
  ): XRowSetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cursorMoved = js.Any.fromFunction1(cursorMoved), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rowChanged = js.Any.fromFunction1(rowChanged), rowSetChanged = js.Any.fromFunction1(rowSetChanged))
    __obj.asInstanceOf[XRowSetListener]
  }
}

