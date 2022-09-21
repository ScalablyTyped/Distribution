package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the basic interface for SAX error handlers.
  *
  * If a SAX application needs to implement customized error handling, it must implement this interface and then register an instance with the SAX parser
  * using the parser's XParser::setErrorhandler() method. The parser will then report all errors and warnings through this interface.
  *
  * This interface is a slight adaption of the Java interface `org.xml.sax.ErrorHandler` . In IDL, no exception can be passed as an argument, so an `any`
  * serves as the container. The type of the exception is {@link SAXParseException} or an instance of a derived class.
  */
trait XErrorHandler
  extends StObject
     with XInterface {
  
  /** receives notification of a recoverable error. */
  def error(aSAXParseException: Any): Unit
  
  /** receives notification of a non-recoverable error. */
  def fatalError(aSAXParseException: Any): Unit
  
  /** receives notification of a warning. */
  def warning(aSAXParseException: Any): Unit
}
object XErrorHandler {
  
  inline def apply(
    acquire: () => Unit,
    error: Any => Unit,
    fatalError: Any => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    warning: Any => Unit
  ): XErrorHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), error = js.Any.fromFunction1(error), fatalError = js.Any.fromFunction1(fatalError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[XErrorHandler]
  }
  
  extension [Self <: XErrorHandler](x: Self) {
    
    inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setFatalError(value: Any => Unit): Self = StObject.set(x, "fatalError", js.Any.fromFunction1(value))
    
    inline def setWarning(value: Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
  }
}
