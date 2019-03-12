package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link XConnection2} extends the `XConnection` interface with `available` and `readSomeBytes` */
trait XConnection2 extends XConnection {
  /** Gives the number of bytes available via `read` without blocking. */
  def available(): scala.Double
  /** Blocks if no data is available otherwise reads at max **nMaxBytesToRead** but at least 1 byte. */
  def readSomeBytes(
    aData: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    nMaxBytesToRead: scala.Double
  ): scala.Double
}

object XConnection2 {
  @scala.inline
  def apply(
    Description: java.lang.String,
    acquire: () => scala.Unit,
    available: () => scala.Double,
    close: () => scala.Unit,
    flush: () => scala.Unit,
    getDescription: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    read: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    release: () => scala.Unit,
    write: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XConnection2 = {
    val __obj = js.Dynamic.literal(Description = Description, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[XConnection2]
  }
}

