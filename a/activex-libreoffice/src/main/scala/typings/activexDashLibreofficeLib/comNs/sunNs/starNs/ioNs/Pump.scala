package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the implementation of a data source and a data sink.
  *
  * A thread will be created that reads from the input stream and writes the data to the connected output stream. Data will not be buffered by this
  * service.
  */
trait Pump
  extends XActiveDataSource
     with XActiveDataSink
     with XActiveDataControl

object Pump {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: js.Function0[scala.Unit],
    addListener: js.Function1[XStreamListener, scala.Unit],
    getInputStream: js.Function0[XInputStream],
    getOutputStream: js.Function0[XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeListener: js.Function1[XStreamListener, scala.Unit],
    setInputStream: js.Function1[XInputStream, scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit],
    start: js.Function0[scala.Unit],
    terminate: js.Function0[scala.Unit]
  ): Pump = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, OutputStream = OutputStream, acquire = acquire, addListener = addListener, getInputStream = getInputStream, getOutputStream = getOutputStream, queryInterface = queryInterface, release = release, removeListener = removeListener, setInputStream = setInputStream, setOutputStream = setOutputStream, start = start, terminate = terminate)
  
    __obj.asInstanceOf[Pump]
  }
}

