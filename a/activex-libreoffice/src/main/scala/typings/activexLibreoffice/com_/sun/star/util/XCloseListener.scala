package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events when an object is called for closing
  *
  * Such close events are broadcasted by a {@link XCloseBroadcaster} if somewhere tries to close it by calling {@link XCloseable.close()} . Listener can:
  * break that by throwing {@link CloseVetoException}or accept that by deregistering itself at this broadcaster.
  *
  * If an event {@link com.sun.star.lang.XEventListener.disposing()} occurred, nobody called {@link XCloseable.close()} on listened object before. Then
  * it's not allowed to break this request - it must be accepted!
  * @see XCloseable
  * @see XCloseBroadcaster
  */
@js.native
trait XCloseListener extends XEventListener {
  
  /**
    * is called when the listened object is closed really
    *
    * Now the listened object is closed really. Listener has to accept that; should deregister itself and release all references to it. It's not allowed
    * nor possible to disagree with that by throwing any exception.
    *
    * If the event {@link com.sun.star.lang.XEventListener.disposing()} occurred before it must be accepted too. There exist no chance for a disagreement
    * any more.
    * @param Source describes the source of the event (must be the listened object)
    */
  def notifyClosing(Source: EventObject): Unit = js.native
  
  /**
    * is called when somewhere tries to close listened object
    *
    * Is called before {@link XCloseListener.notifyClosing()} . Listener has the chance to break that by throwing a {@link CloseVetoException} . This
    * exception must be passed to the original caller of {@link XCloseable.close()} without any interaction.
    *
    * The parameter **GetsOwnership** regulate who has to try to close the listened object again, if this listener disagree with the request by throwing the
    * exception. If it's set to `FALSE` the original caller of {@link XCloseable.close()} will be the owner in every case. It's not allowed to call close()
    * from this listener then. If it's set to `TRUE` this listener will be the new owner if it throw the exception, otherwise not! If it has still running
    * processes will be finished it must call close() on listened object again then.
    *
    * If this listener doesn't disagree with the close request it depends on its internal implementation if it deregisters itself from the listened object.
    * But normally this must be done in {@link XCloseListener.notifyClosing()} .
    * @param Source describes the source of the event (must be the listened object)
    * @param GetsOwnership `TRUE` pass the ownership to this listener, if it throw the veto exception (otherwise this parameter must be ignored!) ; `FALSE` fo
    * @throws CloseVetoException if listener disagree with the close request on listened object it must throw this exception
    */
  def queryClosing(Source: EventObject, GetsOwnership: Boolean): Unit = js.native
}
object XCloseListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyClosing: EventObject => Unit,
    queryClosing: (EventObject, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCloseListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyClosing = js.Any.fromFunction1(notifyClosing), queryClosing = js.Any.fromFunction2(queryClosing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCloseListener]
  }
  
  @scala.inline
  implicit class XCloseListenerOps[Self <: XCloseListener] (val x: Self) extends AnyVal {
    
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
    def setNotifyClosing(value: EventObject => Unit): Self = this.set("notifyClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryClosing(value: (EventObject, Boolean) => Unit): Self = this.set("queryClosing", js.Any.fromFunction2(value))
  }
}
