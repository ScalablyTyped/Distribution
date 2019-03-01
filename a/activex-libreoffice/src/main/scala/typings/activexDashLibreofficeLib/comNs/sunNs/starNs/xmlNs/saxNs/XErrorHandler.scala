package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

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
trait XErrorHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** receives notification of a recoverable error. */
  def error(aSAXParseException: js.Any): scala.Unit
  /** receives notification of a non-recoverable error. */
  def fatalError(aSAXParseException: js.Any): scala.Unit
  /** receives notification of a warning. */
  def warning(aSAXParseException: js.Any): scala.Unit
}

object XErrorHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    error: js.Function1[js.Any, scala.Unit],
    fatalError: js.Function1[js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    warning: js.Function1[js.Any, scala.Unit]
  ): XErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fatalError")(fatalError)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[XErrorHandler]
  }
}

