package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link ScannerException} gets thrown if an object of type {@link XScannerManager} could not complete a specific action. */
trait ScannerException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** Error: contains the specific reason for failure */
  var Error: ScanError
}

object ScannerException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Error: ScanError,
    Message: java.lang.String
  ): ScannerException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ScannerException]
  }
}

