package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style service {@link TextInputStream} .
  * @since LibreOffice 4.1
  */
trait XTextInputStream2
  extends XTextInputStream
     with XActiveDataSink

object XTextInputStream2 {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    getInputStream: js.Function0[XInputStream],
    isEOF: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readLine: js.Function0[java.lang.String],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readString: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Boolean, 
      java.lang.String
    ],
    release: js.Function0[scala.Unit],
    setEncoding: js.Function1[java.lang.String, scala.Unit],
    setInputStream: js.Function1[XInputStream, scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): XTextInputStream2 = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = acquire, available = available, closeInput = closeInput, getInputStream = getInputStream, isEOF = isEOF, queryInterface = queryInterface, readBytes = readBytes, readLine = readLine, readSomeBytes = readSomeBytes, readString = readString, release = release, setEncoding = setEncoding, setInputStream = setInputStream, skipBytes = skipBytes)
  
    __obj.asInstanceOf[XTextInputStream2]
  }
}

