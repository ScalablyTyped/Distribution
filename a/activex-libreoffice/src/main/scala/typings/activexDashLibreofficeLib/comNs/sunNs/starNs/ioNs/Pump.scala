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
    acquire: () => scala.Unit,
    addListener: XStreamListener => scala.Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeListener: XStreamListener => scala.Unit,
    setInputStream: XInputStream => scala.Unit,
    setOutputStream: XOutputStream => scala.Unit,
    start: () => scala.Unit,
    terminate: () => scala.Unit
  ): Pump = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[Pump]
  }
}

