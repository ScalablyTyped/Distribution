package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read the corresponding object from an input stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataSink extends XInterface {
  /** @returns the plugged stream. */
  var InputStream: XInputStream
  /** @returns the plugged stream. */
  def getInputStream(): XInputStream
  /**
    * plugs the input stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for an {@link XConnectable} and connect both.
    */
  def setInputStream(aStream: XInputStream): Unit
}

object XActiveDataSink {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setInputStream: XInputStream => Unit
  ): XActiveDataSink = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
  
    __obj.asInstanceOf[XActiveDataSink]
  }
}

