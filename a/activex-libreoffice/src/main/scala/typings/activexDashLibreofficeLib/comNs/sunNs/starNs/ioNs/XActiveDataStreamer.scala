package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read and write the corresponding stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataStreamer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the plugged stream. */
  var Stream: XStream
  /** @returns the plugged stream. */
  def getStream(): XStream
  /**
    * plugs the input/output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setStream(aStream: XStream): scala.Unit
}

object XActiveDataStreamer {
  @scala.inline
  def apply(
    Stream: XStream,
    acquire: () => scala.Unit,
    getStream: () => XStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setStream: XStream => scala.Unit
  ): XActiveDataStreamer = {
    val __obj = js.Dynamic.literal(Stream = Stream, acquire = js.Any.fromFunction0(acquire), getStream = js.Any.fromFunction0(getStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStream = js.Any.fromFunction1(setStream))
  
    __obj.asInstanceOf[XActiveDataStreamer]
  }
}

