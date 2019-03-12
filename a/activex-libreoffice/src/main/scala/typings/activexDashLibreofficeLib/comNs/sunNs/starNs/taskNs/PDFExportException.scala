package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is an exception that provides information on an error during PDF export. */
trait PDFExportException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains a number of errors that occurred during PDFExport */
  var ErrorCodes: stdLib.SafeArray[scala.Double]
}

object PDFExportException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrorCodes: stdLib.SafeArray[scala.Double],
    Message: java.lang.String
  ): PDFExportException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrorCodes = ErrorCodes, Message = Message)
  
    __obj.asInstanceOf[PDFExportException]
  }
}

