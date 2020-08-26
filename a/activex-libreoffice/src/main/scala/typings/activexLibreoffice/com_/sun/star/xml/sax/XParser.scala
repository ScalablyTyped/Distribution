package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a SAX parser.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Parser** with some minor adaptations.
  */
@js.native
trait XParser extends XInterface {
  /**
    * parses an XML document from a stream.
    *
    * Set the desired handlers before calling this method.
    */
  def parseStream(aInputSource: InputSource): Unit = js.native
  /** allows an application to register a DTD-Handler. */
  def setDTDHandler(xHandler: XDTDHandler): Unit = js.native
  /** allows an application to register a document event handler. */
  def setDocumentHandler(xHandler: XDocumentHandler): Unit = js.native
  /** allows an application to register a DTD-Handler. */
  def setEntityResolver(xResolver: XEntityResolver): Unit = js.native
  /**
    * allows an application to register an error event handler.
    *
    * Note that the error handler can throw an exception when an error or warning occurs. Note that an exception is thrown by the parser when an
    * unrecoverable (fatal) error occurs.
    */
  def setErrorHandler(xHandler: XErrorHandler): Unit = js.native
  /**
    * sets a locale specified for localization of warnings and error messages.
    *
    * Set the language of the error messages. Useful when the parsing errors will be presented to the user.
    */
  def setLocale(locale: Locale): Unit = js.native
}

object XParser {
  @scala.inline
  def apply(
    acquire: () => Unit,
    parseStream: InputSource => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDTDHandler: XDTDHandler => Unit,
    setDocumentHandler: XDocumentHandler => Unit,
    setEntityResolver: XEntityResolver => Unit,
    setErrorHandler: XErrorHandler => Unit,
    setLocale: Locale => Unit
  ): XParser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), parseStream = js.Any.fromFunction1(parseStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDTDHandler = js.Any.fromFunction1(setDTDHandler), setDocumentHandler = js.Any.fromFunction1(setDocumentHandler), setEntityResolver = js.Any.fromFunction1(setEntityResolver), setErrorHandler = js.Any.fromFunction1(setErrorHandler), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[XParser]
  }
  @scala.inline
  implicit class XParserOps[Self <: XParser] (val x: Self) extends AnyVal {
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
    def setParseStream(value: InputSource => Unit): Self = this.set("parseStream", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDTDHandler(value: XDTDHandler => Unit): Self = this.set("setDTDHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDocumentHandler(value: XDocumentHandler => Unit): Self = this.set("setDocumentHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEntityResolver(value: XEntityResolver => Unit): Self = this.set("setEntityResolver", js.Any.fromFunction1(value))
    @scala.inline
    def setSetErrorHandler(value: XErrorHandler => Unit): Self = this.set("setErrorHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLocale(value: Locale => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
  }
  
}

