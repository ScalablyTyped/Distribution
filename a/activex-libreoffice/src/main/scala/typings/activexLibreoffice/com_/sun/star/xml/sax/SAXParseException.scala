package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * stores information for locating the error in the original XML document.
  * @see XLocator
  */
trait SAXParseException extends SAXException {
  /** contains the column number in the document. */
  var ColumnNumber: Double
  /** contains the line number in the document. */
  var LineNumber: Double
  /** contains the public identifier of the document where the exception has occurred. */
  var PublicId: String
  /** contains the system identifier of the document. */
  var SystemId: String
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
}

