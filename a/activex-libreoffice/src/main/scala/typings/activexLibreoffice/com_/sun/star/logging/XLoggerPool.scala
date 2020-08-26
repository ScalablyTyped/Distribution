package typings.activexLibreoffice.com_.sun.star.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a pool for named {@link XLogger} instances
  * @since OOo 2.3
  */
@js.native
trait XLoggerPool extends js.Object {
  /**
    * retrieves a logger with the default name "org.openoffice.logging.DefaultLogger".
    *
    * Calling this method is equivalent to calling `getNamedLogger( "org.openoffice.logging.DefaultLogger" )` .
    */
  val DefaultLogger: XLogger = js.native
  /**
    * retrieves a logger with the default name "org.openoffice.logging.DefaultLogger".
    *
    * Calling this method is equivalent to calling `getNamedLogger( "org.openoffice.logging.DefaultLogger" )` .
    */
  def getDefaultLogger(): XLogger = js.native
  /**
    * retrieves a logger with the given name
    *
    * Multiple attempts to retrieve a logger with the same name will return the same instance.
    *
    * Newly created logger instances are initialized via configuration. See the configuration module `/org.openoffice.Office.Logging` for an explanation of
    * the initialization pattern.
    */
  def getNamedLogger(Name: String): XLogger = js.native
}

object XLoggerPool {
  @scala.inline
  def apply(DefaultLogger: XLogger, getDefaultLogger: () => XLogger, getNamedLogger: String => XLogger): XLoggerPool = {
    val __obj = js.Dynamic.literal(DefaultLogger = DefaultLogger.asInstanceOf[js.Any], getDefaultLogger = js.Any.fromFunction0(getDefaultLogger), getNamedLogger = js.Any.fromFunction1(getNamedLogger))
    __obj.asInstanceOf[XLoggerPool]
  }
  @scala.inline
  implicit class XLoggerPoolOps[Self <: XLoggerPool] (val x: Self) extends AnyVal {
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
    def setDefaultLogger(value: XLogger): Self = this.set("DefaultLogger", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDefaultLogger(value: () => XLogger): Self = this.set("getDefaultLogger", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNamedLogger(value: String => XLogger): Self = this.set("getNamedLogger", js.Any.fromFunction1(value))
  }
  
}

