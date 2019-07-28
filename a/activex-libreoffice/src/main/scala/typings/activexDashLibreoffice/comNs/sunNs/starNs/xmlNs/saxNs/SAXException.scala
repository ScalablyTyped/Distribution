package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait SAXException extends Exception {
  /** This field may contain a wrapped exception. */
  var WrappedException: js.Any
}

object SAXException {
  @scala.inline
  def apply(Context: XInterface, Message: String, WrappedException: js.Any): SAXException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, WrappedException = WrappedException)
  
    __obj.asInstanceOf[SAXException]
  }
}

