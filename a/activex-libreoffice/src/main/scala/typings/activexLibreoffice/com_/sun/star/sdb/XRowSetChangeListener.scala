package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by components which want to be notified when the `RowSet` supplied by a {@link XRowSetSupplier} changes.
  * @see XRowSetChangeBroadcaster
  * @see XRowSetSupplier
  * @since OOo 3.2
  */
@js.native
trait XRowSetChangeListener extends XEventListener {
  
  /** notifies the listener that the `RowSet` associated with a {@link XRowSetSupplier} has changed. */
  def onRowSetChanged(iEvent: EventObject): Unit = js.native
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
  
  @scala.inline
  implicit class XRowSetChangeListenerOps[Self <: XRowSetChangeListener] (val x: Self) extends AnyVal {
    
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
    def setOnRowSetChanged(value: EventObject => Unit): Self = this.set("onRowSetChanged", js.Any.fromFunction1(value))
  }
}
