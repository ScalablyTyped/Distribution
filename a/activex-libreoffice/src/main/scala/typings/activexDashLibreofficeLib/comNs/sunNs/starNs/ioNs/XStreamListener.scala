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
    acquire: js.Function0[scala.Unit],
    closed: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    error: js.Function1[js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    started: js.Function0[scala.Unit],
    terminated: js.Function0[scala.Unit]
  ): XStreamListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("started")(started)
    __obj.updateDynamic("terminated")(terminated)
    __obj.asInstanceOf[XStreamListener]
  }
}

