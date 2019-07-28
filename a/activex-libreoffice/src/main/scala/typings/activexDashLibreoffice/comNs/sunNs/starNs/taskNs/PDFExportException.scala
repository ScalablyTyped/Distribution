package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is an exception that provides information on an error during PDF export. */
trait PDFExportException extends Exception {
  /** contains a number of errors that occurred during PDFExport */
  var ErrorCodes: SafeArray[Double]
}

object PDFExportException {
  @scala.inline
  def apply(Context: XInterface, ErrorCodes: SafeArray[Double], Message: String): PDFExportException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrorCodes = ErrorCodes, Message = Message)
  
    __obj.asInstanceOf[PDFExportException]
  }
}

