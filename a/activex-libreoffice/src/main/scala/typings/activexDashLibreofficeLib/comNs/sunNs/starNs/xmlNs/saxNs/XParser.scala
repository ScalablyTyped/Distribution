package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a SAX parser.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Parser** with some minor adaptations.
  */
trait XParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * parses an XML document from a stream.
    *
    * Set the desired handlers before calling this method.
    */
  def parseStream(aInputSource: InputSource): scala.Unit
  /** allows an application to register a DTD-Handler. */
  def setDTDHandler(xHandler: XDTDHandler): scala.Unit
  /** allows an application to register a document event handler. */
  def setDocumentHandler(xHandler: XDocumentHandler): scala.Unit
  /** allows an application to register a DTD-Handler. */
  def setEntityResolver(xResolver: XEntityResolver): scala.Unit
  /**
    * allows an application to register an error event handler.
    *
    * Note that the error handler can throw an exception when an error or warning occurs. Note that an exception is thrown by the parser when an
    * unrecoverable (fatal) error occurs.
    */
  def setErrorHandler(xHandler: XErrorHandler): scala.Unit
  /**
    * sets a locale specified for localization of warnings and error messages.
    *
    * Set the language of the error messages. Useful when the parsing errors will be presented to the user.
    */
  def setLocale(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
}

