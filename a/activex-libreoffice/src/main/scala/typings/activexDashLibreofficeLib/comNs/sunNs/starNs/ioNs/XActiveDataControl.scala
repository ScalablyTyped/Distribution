package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to control an active data source.
  *
  * This interface should be supported by objects which implement {@link XActiveDataSource} or {@link XActiveDataSink} .
  */
trait XActiveDataControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addListener(aListener: XStreamListener): scala.Unit
  /**
    * unregisters an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeListener(aListener: XStreamListener): scala.Unit
  /**
    * starts I/O.
    *
    * Either XActiveDataControl::setInputStream() or XActiveDataControl::setOutputStream() must be called beforehand.
    *
    * This method does not block the thread, so reading is generally not finished when the method returns.
    */
  def start(): scala.Unit
  /**
    * does a weak abort.
    *
    * It closes all connected resources and calls XInputStream::close() or XOutputStream::close() and fires the {@link XStreamListener.terminated()} -event.
    */
  def terminate(): scala.Unit
}

object XActiveDataControl {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addListener: js.Function1[XStreamListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeListener: js.Function1[XStreamListener, scala.Unit],
    start: js.Function0[scala.Unit],
    terminate: js.Function0[scala.Unit]
  ): XActiveDataControl = {
    val __obj = js.Dynamic.literal(acquire = acquire, addListener = addListener, queryInterface = queryInterface, release = release, removeListener = removeListener, start = start, terminate = terminate)
  
    __obj.asInstanceOf[XActiveDataControl]
  }
}

