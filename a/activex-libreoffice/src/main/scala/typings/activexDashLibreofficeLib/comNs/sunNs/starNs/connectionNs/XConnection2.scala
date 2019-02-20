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

