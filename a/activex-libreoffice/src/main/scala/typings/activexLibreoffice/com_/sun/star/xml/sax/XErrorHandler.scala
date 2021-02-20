package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait XErrorHandler extends XInterface {
  
  /** receives notification of a recoverable error. */
  def error(aSAXParseException: js.Any): Unit = js.native
  
  /** receives notification of a non-recoverable error. */
  def fatalError(aSAXParseException: js.Any): Unit = js.native
  
  /** receives notification of a warning. */
  def warning(aSAXParseException: js.Any): Unit = js.native
}
object XErrorHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    error: js.Any => Unit,
    fatalError: js.Any => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    warning: js.Any => Unit
  ): XErrorHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), error = js.Any.fromFunction1(error), fatalError = js.Any.fromFunction1(fatalError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[XErrorHandler]
  }
  
  @scala.inline
  implicit class XErrorHandlerMutableBuilder[Self <: XErrorHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFatalError(value: js.Any => Unit): Self = StObject.set(x, "fatalError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarning(value: js.Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
  }
}
