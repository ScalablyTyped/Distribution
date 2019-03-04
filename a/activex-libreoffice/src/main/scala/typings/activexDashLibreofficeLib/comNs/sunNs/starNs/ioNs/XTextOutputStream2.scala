package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style service {@link TextOutputStream} .
  * @since LibreOffice 4.1
  */
trait XTextOutputStream2
  extends XTextOutputStream
     with XActiveDataSource

object XTextOutputStream2 {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getOutputStream: js.Function0[XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setEncoding: js.Function1[java.lang.String, scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    writeString: js.Function1[java.lang.String, scala.Unit]
  ): XTextOutputStream2 = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = acquire, closeOutput = closeOutput, flush = flush, getOutputStream = getOutputStream, queryInterface = queryInterface, release = release, setEncoding = setEncoding, setOutputStream = setOutputStream, writeBytes = writeBytes, writeString = writeString)
  
    __obj.asInstanceOf[XTextOutputStream2]
  }
}

