package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events from an active data control. */
trait XStreamListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called when data transfer terminates normally or when data transfer is terminated from outside.
    *
    * The termination could be done using the method {@link XActiveDataControl.terminate()} .
    */
  def closed(): scala.Unit
  /**
    * gets called when an internal error in source or sink has occurred.
    *
    * After the method is called, the close is called on the connected streams.
    */
  def error(aException: js.Any): scala.Unit
  /** gets called as soon as data transfer has started. */
  def started(): scala.Unit
  /** gets called when {@link XActiveDataControl.terminate()} is called. */
  def terminated(): scala.Unit
}

object XStreamListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    closed: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    error: js.Any => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    started: () => scala.Unit,
    terminated: () => scala.Unit
  ): XStreamListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closed = js.Any.fromFunction0(closed), disposing = js.Any.fromFunction1(disposing), error = js.Any.fromFunction1(error), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), started = js.Any.fromFunction0(started), terminated = js.Any.fromFunction0(terminated))
  
    __obj.asInstanceOf[XStreamListener]
  }
}

