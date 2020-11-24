package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to receive notifications from an {@link XDynamicResultSet} . */
@js.native
trait XDynamicResultSetListener extends XEventListener {
  
  /**
    * A method used to propagate changes of a result set.
    *
    * In the first notify-call the listener gets two(!) com::sun::star::sdbc::XResultSets and has to hold them. The com::sun::star::sdbc::XResultSets are
    * implementations of the service {@link ContentResultSet} .
    *
    * The notified new {@link com.sun.star.sdbc.XResultSet} will stay valid after returning from this method. The old one will become invalid after
    * returning.
    *
    * While in notify-call the listener is allowed to read from old and new result set, except in the first call, where only the new result set is valid.
    *
    * The Listener is allowed to stay (block) this call, until it really wants to use the new result set. The only situation, where the listener has to
    * return immediately is while it disposes its broadcaster or while it is removing itself as listener (otherwise you deadlock)!!!
    * @param Changes the changes to notify.
    */
  def notify(Changes: ListEvent): Unit = js.native
}
object XDynamicResultSetListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notify: ListEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDynamicResultSetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notify = js.Any.fromFunction1(notify), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDynamicResultSetListener]
  }
  
  @scala.inline
  implicit class XDynamicResultSetListenerOps[Self <: XDynamicResultSetListener] (val x: Self) extends AnyVal {
    
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
    def setNotify(value: ListEvent => Unit): Self = this.set("notify", js.Any.fromFunction1(value))
  }
}
