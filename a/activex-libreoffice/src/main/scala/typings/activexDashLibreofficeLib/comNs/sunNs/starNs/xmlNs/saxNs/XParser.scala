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

object XParser {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    parseStream: js.Function1[InputSource, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDTDHandler: js.Function1[XDTDHandler, scala.Unit],
    setDocumentHandler: js.Function1[XDocumentHandler, scala.Unit],
    setEntityResolver: js.Function1[XEntityResolver, scala.Unit],
    setErrorHandler: js.Function1[XErrorHandler, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit]
  ): XParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("parseStream")(parseStream)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDTDHandler")(setDTDHandler)
    __obj.updateDynamic("setDocumentHandler")(setDocumentHandler)
    __obj.updateDynamic("setEntityResolver")(setEntityResolver)
    __obj.updateDynamic("setErrorHandler")(setErrorHandler)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.asInstanceOf[XParser]
  }
}

