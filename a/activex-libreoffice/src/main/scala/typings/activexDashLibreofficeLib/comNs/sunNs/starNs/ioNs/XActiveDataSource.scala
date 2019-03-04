package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be implemented if the class should be able to write into an output stream.
  * @see XActiveDataControl.
  */
trait XActiveDataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the plugged stream. */
  var OutputStream: XOutputStream
  /** @returns the plugged stream. */
  def getOutputStream(): XOutputStream
  /**
    * plugs the output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setOutputStream(aStream: XOutputStream): scala.Unit
}

object XActiveDataSource {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: js.Function0[scala.Unit],
    getOutputStream: js.Function0[XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit]
  ): XActiveDataSource = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = acquire, getOutputStream = getOutputStream, queryInterface = queryInterface, release = release, setOutputStream = setOutputStream)
  
    __obj.asInstanceOf[XActiveDataSource]
  }
}

