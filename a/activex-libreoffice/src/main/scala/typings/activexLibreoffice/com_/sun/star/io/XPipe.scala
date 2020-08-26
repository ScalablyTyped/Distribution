package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The implementation of an output stream and an input stream.
  *
  * All data written through the outputstream is buffered until it is read again from the input stream. Often two different threads access input and
  * outputstream.
  *
  * With the pipe-service, an outputstream can be converted into an input stream at the cost of an additional buffer.
  * @since LibreOffice 4.0
  */
@js.native
trait XPipe
  extends XOutputStream
     with XInputStream

object XPipe {
  @scala.inline
  def apply(
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    skipBytes: Double => Unit,
    writeBytes: SeqEquiv[Double] => Unit
  ): XPipe = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), skipBytes = js.Any.fromFunction1(skipBytes), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[XPipe]
  }
}

