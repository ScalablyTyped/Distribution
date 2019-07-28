package typings.activexDashLibreoffice.comNs.sunNs.starNs.scannerNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link ScannerException} gets thrown if an object of type {@link XScannerManager} could not complete a specific action. */
trait ScannerException extends Exception {
  /** Error: contains the specific reason for failure */
  var Error: ScanError
}

object ScannerException {
  @scala.inline
  def apply(Context: XInterface, Error: ScanError, Message: String): ScannerException = {
    val __obj = js.Dynamic.literal(Context = Context, Error = Error, Message = Message)
  
    __obj.asInstanceOf[ScannerException]
  }
}

