package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for receiving "rowsChanged" events posted by, for example, a row set. */
@js.native
trait XRowsChangeListener extends XEventListener {
  /**
    * is called when rows are inserted, updated, or deleted.
    * @param event contains information about the event
    */
  def rowsChanged(event: RowsChangeEvent): Unit = js.native
}

object XRowsChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    rowsChanged: RowsChangeEvent => Unit
  ): XRowsChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rowsChanged = js.Any.fromFunction1(rowsChanged))
    __obj.asInstanceOf[XRowsChangeListener]
  }
  @scala.inline
  implicit class XRowsChangeListenerOps[Self <: XRowsChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowsChanged(value: RowsChangeEvent => Unit): Self = this.set("rowsChanged", js.Any.fromFunction1(value))
  }
  
}

