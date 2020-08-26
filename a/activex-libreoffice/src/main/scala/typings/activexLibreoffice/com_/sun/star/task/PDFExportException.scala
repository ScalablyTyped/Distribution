package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is an exception that provides information on an error during PDF export. */
@js.native
trait PDFExportException extends Exception {
  /** contains a number of errors that occurred during PDFExport */
  var ErrorCodes: SafeArray[Double] = js.native
}

object PDFExportException {
  @scala.inline
  def apply(Context: XInterface, ErrorCodes: SafeArray[Double], Message: String): PDFExportException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCodes = ErrorCodes.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFExportException]
  }
  @scala.inline
  implicit class PDFExportExceptionOps[Self <: PDFExportException] (val x: Self) extends AnyVal {
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
    def setErrorCodes(value: SafeArray[Double]): Self = this.set("ErrorCodes", value.asInstanceOf[js.Any])
  }
  
}

