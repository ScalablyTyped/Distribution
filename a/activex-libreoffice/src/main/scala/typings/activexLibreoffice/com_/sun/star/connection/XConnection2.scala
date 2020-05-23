package typings.activexLibreoffice.com_.sun.star.connection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link XConnection2} extends the `XConnection` interface with `available` and `readSomeBytes` */
trait XConnection2 extends XConnection {
  /** Gives the number of bytes available via `read` without blocking. */
  def available(): Double
  /** Blocks if no data is available otherwise reads at max **nMaxBytesToRead** but at least 1 byte. */
  def readSomeBytes(aData: js.Array[SeqEquiv[Double]], nMaxBytesToRead: Double): Double
}

object XConnection2 {
  @scala.inline
  def apply(
    Description: String,
    acquire: () => Unit,
    available: () => Double,
    close: () => Unit,
    flush: () => Unit,
    getDescription: () => String,
    queryInterface: `type` => js.Any,
    read: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    write: SeqEquiv[Double] => Unit
  ): XConnection2 = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XConnection2]
  }
}

