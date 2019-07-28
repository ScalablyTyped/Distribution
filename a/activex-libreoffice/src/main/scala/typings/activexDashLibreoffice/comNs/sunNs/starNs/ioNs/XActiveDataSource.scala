package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be implemented if the class should be able to write into an output stream.
  * @see XActiveDataControl.
  */
trait XActiveDataSource extends XInterface {
  /** @returns the plugged stream. */
  var OutputStream: XOutputStream
  /** @returns the plugged stream. */
  def getOutputStream(): XOutputStream
  /**
    * plugs the output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setOutputStream(aStream: XOutputStream): Unit
}

object XActiveDataSource {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: () => Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit
  ): XActiveDataSource = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream))
  
    __obj.asInstanceOf[XActiveDataSource]
  }
}

