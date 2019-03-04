package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provide a central access point for a group of events.
  *
  * Listeners can be added with a simple restriction on the event source. They are only called for events that originate at the specified source.
  *
  * Event providers can broadcast an event to all interested listeners.
  *
  * The XEventMultiplexer interface is typically implemented as a singleton
  */
trait XContextChangeEventMultiplexer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Add an event listener that is called only when events are broadcast for the specified event focus.
    * @param xListener An empty reference results in an InvalidArgumentException. One listener may be added more than once for different event foci. Adding a
    * @param xEventFocus An empty reference is a valid value. In this case the registered listener will be called for every event broadcast, regardless of its
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def addContextChangeEventListener(
    xListener: XContextChangeEventListener,
    xEventFocus: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): scala.Unit
  /** Call all event listeners that where added for the specified event focus. */
  def broadcastContextChangeEvent(
    aEvent: ContextChangeEventObject,
    xEventFocus: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): scala.Unit
  /**
    * Remove an event listener for all event foci.
    * @param xListener An empty reference results in an InvalidArgumentException. It is not an error when the listener is not registered for any event focus.
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def removeAllContextChangeEventListeners(xListener: XContextChangeEventListener): scala.Unit
  /**
    * Remove an event listener for the specified event focus.
    *
    * When the same listener was added for other event foci then these associations remain unmodified.
    * @param xListener An empty reference results in an InvalidArgumentException. When the listener is not registered for the given event focus then an Invali
    * @param xEventFocus The listener is only removed for this event focus. An empty reference is a valid value.
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def removeContextChangeEventListener(
    xListener: XContextChangeEventListener,
    xEventFocus: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): scala.Unit
}

object XContextChangeEventMultiplexer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addContextChangeEventListener: js.Function2[
      XContextChangeEventListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    broadcastContextChangeEvent: js.Function2[
      ContextChangeEventObject, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAllContextChangeEventListeners: js.Function1[XContextChangeEventListener, scala.Unit],
    removeContextChangeEventListener: js.Function2[
      XContextChangeEventListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ]
  ): XContextChangeEventMultiplexer = {
    val __obj = js.Dynamic.literal(acquire = acquire, addContextChangeEventListener = addContextChangeEventListener, broadcastContextChangeEvent = broadcastContextChangeEvent, queryInterface = queryInterface, release = release, removeAllContextChangeEventListeners = removeAllContextChangeEventListeners, removeContextChangeEventListener = removeContextChangeEventListener)
  
    __obj.asInstanceOf[XContextChangeEventMultiplexer]
  }
}

