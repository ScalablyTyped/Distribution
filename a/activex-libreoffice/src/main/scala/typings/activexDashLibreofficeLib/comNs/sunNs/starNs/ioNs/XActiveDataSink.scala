package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read the corresponding object from an input stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataSink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the plugged stream. */
  var InputStream: XInputStream
  /** @returns the plugged stream. */
  def getInputStream(): XInputStream
  /**
    * plugs the input stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for an {@link XConnectable} and connect both.
    */
  def setInputStream(aStream: XInputStream): scala.Unit
}

object XActiveDataSink {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    acquire: js.Function0[scala.Unit],
    getInputStream: js.Function0[XInputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setInputStream: js.Function1[XInputStream, scala.Unit]
  ): XActiveDataSink = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = acquire, getInputStream = getInputStream, queryInterface = queryInterface, release = release, setInputStream = setInputStream)
  
    __obj.asInstanceOf[XActiveDataSink]
  }
}

