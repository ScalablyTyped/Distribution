package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates the details of an XML parse error or warning.
  *
  * This structure is a replacement for the Java class **org.xml.sax.SAXException** .
  *
  * Some abbreviations:
  *
  * SAX = Simple API for XMLURI = Uniform Resource IdentifierDTD = document type definition
  */
trait SAXException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** This field may contain a wrapped exception. */
  var WrappedException: js.Any
}

object SAXException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    WrappedException: js.Any
  ): SAXException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("WrappedException")(WrappedException)
    __obj.asInstanceOf[SAXException]
  }
}

