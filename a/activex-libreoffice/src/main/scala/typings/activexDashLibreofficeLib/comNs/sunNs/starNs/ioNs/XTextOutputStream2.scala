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
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setEncoding: java.lang.String => scala.Unit,
    setOutputStream: XOutputStream => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    writeString: java.lang.String => scala.Unit
  ): XTextOutputStream2 = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), setOutputStream = js.Any.fromFunction1(setOutputStream), writeBytes = js.Any.fromFunction1(writeBytes), writeString = js.Any.fromFunction1(writeString))
  
    __obj.asInstanceOf[XTextOutputStream2]
  }
}

