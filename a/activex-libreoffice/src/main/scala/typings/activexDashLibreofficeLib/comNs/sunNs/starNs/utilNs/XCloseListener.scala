package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events when an object is called for closing
  *
  * Such close events are broadcasted by a {@link XCloseBroadcaster} if somewhere tries to close it by calling {@link XCloseable.close()} . Listener can:
  * break that by throwing {@link CloseVetoException}or accept that by deregister himself at this broadcaster.
  *
  * If an event {@link com.sun.star.lang.XEventListener.disposing()} occurred, nobody called {@link XCloseable.close()} on listened object before. Then
  * it's not allowed to break this request - it must be accepted!
  * @see XCloseable
  * @see XCloseBroadcaster
  */
trait XCloseListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when the listened object is closed really
    *
    * Now the listened object is closed really. Listener has to accept that; should deregister himself and release all references to it. It's not allowed
    * nor possible to disagree with that by throwing any exception.
    *
    * If the event {@link com.sun.star.lang.XEventListener.disposing()} occurred before it must be accepted too. There exist no chance for a disagreement
    * any more.
    * @param Source describes the source of the event (must be the listened object)
    */
  def notifyClosing(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is called when somewhere tries to close listened object
    *
    * Is called before {@link XCloseListener.notifyClosing()} . Listener has the chance to break that by throwing a {@link CloseVetoException} . This
    * exception must be passed to the original caller of {@link XCloseable.close()} without any interaction.
    *
    * The parameter **GetsOwnership** regulate who has to try to close the listened object again, if this listener disagree with the request by throwing the
    * exception. If it's set to `FALSE` the original caller of {@link XCloseable.close()} will be the owner in every case. It's not allowed to call close()
    * from this listener then. If it's set to `TRUE` this listener will be the new owner if he throw the exception, otherwise not! If his still running
    * processes will be finished he must call close() on listened object again then.
    *
    * If this listener doesn't disagree with th close request it depends from his internal implementation if he deregister himself at the listened object.
    * But normally this must be done in {@link XCloseListener.notifyClosing()} .
    * @param Source describes the source of the event (must be the listened object)
    * @param GetsOwnership `TRUE` pass the ownership to this listener, if he throw the veto exception (otherwise this parameter must be ignored!) ; `FALSE` fo
    * @throws CloseVetoException if listener disagree with the close request on listened object he must throw this exception
    */
  def queryClosing(
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject,
    GetsOwnership: scala.Boolean
  ): scala.Unit
}

