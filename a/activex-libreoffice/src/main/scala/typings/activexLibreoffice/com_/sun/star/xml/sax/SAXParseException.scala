package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * stores information for locating the error in the original XML document.
  * @see XLocator
  */
@js.native
trait SAXParseException extends SAXException {
  /** contains the column number in the document. */
  var ColumnNumber: Double = js.native
  /** contains the line number in the document. */
  var LineNumber: Double = js.native
  /** contains the public identifier of the document where the exception has occurred. */
  var PublicId: String = js.native
  /** contains the system identifier of the document. */
  var SystemId: String = js.native
}

object SAXParseException {
  @scala.inline
  def apply(
    ColumnNumber: Double,
    Context: XInterface,
    LineNumber: Double,
    Message: String,
    PublicId: String,
    SystemId: String,
    WrappedException: js.Any
  ): SAXParseException = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], WrappedException = WrappedException.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXParseException]
  }
  @scala.inline
  implicit class SAXParseExceptionOps[Self <: SAXParseException] (val x: Self) extends AnyVal {
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
    def setColumnNumber(value: Double): Self = this.set("ColumnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("LineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicId(value: String): Self = this.set("PublicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemId(value: String): Self = this.set("SystemId", value.asInstanceOf[js.Any])
  }
  
}

