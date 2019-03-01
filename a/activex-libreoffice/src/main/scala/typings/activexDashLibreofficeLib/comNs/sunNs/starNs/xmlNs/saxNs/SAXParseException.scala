package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * stores information for locating the error in the original XML document.
  * @see XLocator
  */
trait SAXParseException extends SAXException {
  /** contains the column number in the document. */
  var ColumnNumber: scala.Double
  /** contains the line number in the document. */
  var LineNumber: scala.Double
  /** contains the public identifier of the document where the exception has occurred. */
  var PublicId: java.lang.String
  /** contains the system identifier of the document. */
  var SystemId: java.lang.String
}

object SAXParseException {
  @scala.inline
  def apply(
    ColumnNumber: scala.Double,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    LineNumber: scala.Double,
    Message: java.lang.String,
    PublicId: java.lang.String,
    SystemId: java.lang.String,
    WrappedException: js.Any
  ): SAXParseException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnNumber")(ColumnNumber)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("LineNumber")(LineNumber)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("PublicId")(PublicId)
    __obj.updateDynamic("SystemId")(SystemId)
    __obj.updateDynamic("WrappedException")(WrappedException)
    __obj.asInstanceOf[SAXParseException]
  }
}

