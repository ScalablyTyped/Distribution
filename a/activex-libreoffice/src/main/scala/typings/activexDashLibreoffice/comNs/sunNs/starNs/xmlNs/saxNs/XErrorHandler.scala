package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the basic interface for SAX error handlers.
  *
  * If a SAX application needs to implement customized error handling, it must implement this interface and then register an instance with the SAX parser
  * using the parser's XParser::setErrorhandler() method. The parser will then report all errors and warnings through this interface.
  *
  * This interface is a slight adaption of the Java interface `org.xml.sax.ErrorHandler` . In IDL, no exception can be passed as an argument, so an `any`
  * serves as the container. The type of the exception is {@link SAXParseException} or an instance of a derived class.
  */
trait XErrorHandler extends XInterface {
  /** receives notification of a recoverable error. */
  def error(aSAXParseException: js.Any): Unit
  /** receives notification of a non-recoverable error. */
  def fatalError(aSAXParseException: js.Any): Unit
  /** receives notification of a warning. */
  def warning(aSAXParseException: js.Any): Unit
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
}

