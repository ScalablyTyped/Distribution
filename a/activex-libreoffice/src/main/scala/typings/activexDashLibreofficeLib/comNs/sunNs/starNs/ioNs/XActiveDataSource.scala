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

