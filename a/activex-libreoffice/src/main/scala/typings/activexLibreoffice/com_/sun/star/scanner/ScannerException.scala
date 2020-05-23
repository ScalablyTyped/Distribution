package typings.activexLibreoffice.com_.sun.star.scanner

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerException]
  }
}

