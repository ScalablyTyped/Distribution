package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
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
    notify_ : ListEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDynamicResultSetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("notify")(js.Any.fromFunction1(notify_))
    __obj.asInstanceOf[XDynamicResultSetListener]
  }
  
  @scala.inline
  implicit class XDynamicResultSetListenerMutableBuilder[Self <: XDynamicResultSetListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotify_(value: ListEvent => Unit): Self = StObject.set(x, "notify", js.Any.fromFunction1(value))
  }
}
