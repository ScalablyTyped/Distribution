package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read and write the corresponding stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataStreamer extends XInterface {
  /** @returns the plugged stream. */
  var Stream: XStream
  /** @returns the plugged stream. */
  def getStream(): XStream
  /**
    * plugs the input/output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setStream(aStream: XStream): Unit
}

object XActiveDataStreamer {
  @scala.inline
  def apply(
    Stream: XStream,
    acquire: () => Unit,
    getStream: () => XStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStream: XStream => Unit
  ): XActiveDataStreamer = {
    val __obj = js.Dynamic.literal(Stream = Stream, acquire = js.Any.fromFunction0(acquire), getStream = js.Any.fromFunction0(getStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStream = js.Any.fromFunction1(setStream))
  
    __obj.asInstanceOf[XActiveDataStreamer]
  }
}

