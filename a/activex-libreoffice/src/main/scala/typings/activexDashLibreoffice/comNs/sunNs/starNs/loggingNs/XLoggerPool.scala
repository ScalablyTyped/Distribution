package typings.activexDashLibreoffice.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a pool for named {@link XLogger} instances
  * @since OOo 2.3
  */
trait XLoggerPool extends js.Object {
  /**
    * retrieves a logger with the default name "org.openoffice.logging.DefaultLogger".
    *
    * Calling this method is equivalent to calling `getNamedLogger( "org.openoffice.logging.DefaultLogger" )` .
    */
  val DefaultLogger: XLogger
  /**
    * retrieves a logger with the default name "org.openoffice.logging.DefaultLogger".
    *
    * Calling this method is equivalent to calling `getNamedLogger( "org.openoffice.logging.DefaultLogger" )` .
    */
  def getDefaultLogger(): XLogger
  /**
    * retrieves a logger with the given name
    *
    * Multiple attempts to retrieve a logger with the same name will return the same instance.
    *
    * Newly created logger instances are initialized via configuration. See the configuration module `/org.openoffice.Office.Logging` for an explanation of
    * the initialization pattern.
    */
  def getNamedLogger(Name: String): XLogger
}

object XLoggerPool {
  @scala.inline
  def apply(DefaultLogger: XLogger, getDefaultLogger: () => XLogger, getNamedLogger: String => XLogger): XLoggerPool = {
    val __obj = js.Dynamic.literal(DefaultLogger = DefaultLogger, getDefaultLogger = js.Any.fromFunction0(getDefaultLogger), getNamedLogger = js.Any.fromFunction1(getNamedLogger))
  
    __obj.asInstanceOf[XLoggerPool]
  }
}

