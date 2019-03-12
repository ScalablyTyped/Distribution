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
    acquire: () => scala.Unit,
    available: () => scala.Double,
    closeInput: () => scala.Unit,
    getInputStream: () => XInputStream,
    isEOF: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readLine: () => java.lang.String,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readString: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Boolean) => java.lang.String,
    release: () => scala.Unit,
    setEncoding: java.lang.String => scala.Unit,
    setInputStream: XInputStream => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): XTextInputStream2 = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), getInputStream = js.Any.fromFunction0(getInputStream), isEOF = js.Any.fromFunction0(isEOF), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readLine = js.Any.fromFunction0(readLine), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readString = js.Any.fromFunction2(readString), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), setInputStream = js.Any.fromFunction1(setInputStream), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[XTextInputStream2]
  }
}

