package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a SAX parser.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Parser** with some minor adaptations.
  */
trait XParser
  extends StObject
     with XInterface {
  
  /**
    * parses an XML document from a stream.
    *
    * Set the desired handlers before calling this method.
    */
  def parseStream(aInputSource: InputSource): Unit
  
  /** allows an application to register a DTD-Handler. */
  def setDTDHandler(xHandler: XDTDHandler): Unit
  
  /** allows an application to register a document event handler. */
  def setDocumentHandler(xHandler: XDocumentHandler): Unit
  
  /** allows an application to register a DTD-Handler. */
  def setEntityResolver(xResolver: XEntityResolver): Unit
  
  /**
    * allows an application to register an error event handler.
    *
    * Note that the error handler can throw an exception when an error or warning occurs. Note that an exception is thrown by the parser when an
    * unrecoverable (fatal) error occurs.
    */
  def setErrorHandler(xHandler: XErrorHandler): Unit
  
  /**
    * sets a locale specified for localization of warnings and error messages.
    *
    * Set the language of the error messages. Useful when the parsing errors will be presented to the user.
    */
  def setLocale(locale: Locale): Unit
}
object XParser {
  
  inline def apply(
    acquire: () => Unit,
    parseStream: InputSource => Unit,
    queryInterface: `type` => Any,
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
  
  extension [Self <: XParser](x: Self) {
    
    inline def setParseStream(value: InputSource => Unit): Self = StObject.set(x, "parseStream", js.Any.fromFunction1(value))
    
    inline def setSetDTDHandler(value: XDTDHandler => Unit): Self = StObject.set(x, "setDTDHandler", js.Any.fromFunction1(value))
    
    inline def setSetDocumentHandler(value: XDocumentHandler => Unit): Self = StObject.set(x, "setDocumentHandler", js.Any.fromFunction1(value))
    
    inline def setSetEntityResolver(value: XEntityResolver => Unit): Self = StObject.set(x, "setEntityResolver", js.Any.fromFunction1(value))
    
    inline def setSetErrorHandler(value: XErrorHandler => Unit): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1(value))
    
    inline def setSetLocale(value: Locale => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
