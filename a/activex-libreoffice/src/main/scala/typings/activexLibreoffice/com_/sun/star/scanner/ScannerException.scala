package typings.activexLibreoffice.com_.sun.star.scanner

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link ScannerException} gets thrown if an object of type {@link XScannerManager} could not complete a specific action. */
@js.native
trait ScannerException extends Exception {
  /** Error: contains the specific reason for failure */
  var Error: ScanError = js.native
}

object ScannerException {
  @scala.inline
  def apply(Context: XInterface, Error: ScanError, Message: String): ScannerException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerException]
  }
  @scala.inline
  implicit class ScannerExceptionOps[Self <: ScannerException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: ScanError): Self = this.set("Error", value.asInstanceOf[js.Any])
  }
  
}

