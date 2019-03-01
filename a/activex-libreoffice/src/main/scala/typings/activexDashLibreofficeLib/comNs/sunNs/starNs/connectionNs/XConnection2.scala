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
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    close: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getDescription: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    release: js.Function0[scala.Unit],
    write: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XConnection2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("readSomeBytes")(readSomeBytes)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[XConnection2]
  }
}

