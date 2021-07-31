package typings.activexLibreoffice.com_.sun.star.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implemented by a component which is able to log events.
  *
  * This interface is roughly designed after the [Java Logging API]{@link
  * url="http://java.sun.com/javase/6/docs/api/java/util/logging/package-summary.html"} . However, there are some differences, the major ones being:
  * There's no support (yet) for filtering log events.There ain't no convenience methods for logging.There's no localization support.Logger instances do
  * not form a hierarchy.
  * @since OOo 2.3
  */
trait XLogger extends StObject {
  
  /**
    * specifies which log events are logged or ignored.
    * @see LogLevel
    */
  var Level: Double
  
  /** denotes the name of the logger. */
  var Name: String
  
  /**
    * adds the given handler to the list of handlers.
    *
    * When an event is logged, the logger will create a {@link LogRecord} for this event, and pass this record to all registered handlers. Single handlers
    * might or might not log those records at their own discretion, and depending on additional restrictions such as filters specified at handler level.
    *
    * Note: The log level of the given handler ( {@link XLogHandler.Level} ) will not be touched. In particular, it will not be set to the logger's log
    * level. It's the responsibility of the component which knits a logger with one or more log handlers to ensure that all loggers have appropriate levels
    * set.
    * @param LogHandler the handler to add to the list of handlers. The call is ignored if this parameter is `NULL` .
    */
  def addLogHandler(LogHandler: XLogHandler): Unit
  
  /**
    * determines whether logger instance would produce any output for the given level.
    *
    * The method can be used to optimize performance as maybe complex parameter evaluation in the `log` calls can be omitted if `isLoggable` evaluates to
    * false.
    * @param Level level to be checked against
    * @returns `TRUE` if there would be some output for this {@link XLogger} for the given level, `FALSE` otherwise. Note that a return value of `FALSE` could a
    * @see addLogHandler
    * @see removeLogHandler
    */
  def isLoggable(Level: Double): Boolean
  
  /**
    * logs a given message
    * @param Level the log level of this message. If this level is smaller than the logger's {@link Level} attribute, then the call will be ignored.
    * @param Message the message to log
    */
  def log(Level: Double, Message: String): Unit
  
  /**
    * logs a given message, detailing the source class and method at which the logged event occurred.
    * @param Level the log level of this message. If this level is smaller than the logger's {@link Level} attribute, then the call will be ignored.
    * @param SourceClass the source class at which the logged event occurred.
    * @param SourceMethod the source class at which the logged event occurred.
    * @param Message the message to log
    */
  def logp(Level: Double, SourceClass: String, SourceMethod: String, Message: String): Unit
  
  /**
    * removes the given handler from the list of handlers.
    * @param LogHandler the handler to remove from the list of handlers. The call is ignored if this parameter is `NULL` , or if the handler has not previousl
    */
  def removeLogHandler(LogHandler: XLogHandler): Unit
}
object XLogger {
  
  @scala.inline
  def apply(
    Level: Double,
    Name: String,
    addLogHandler: XLogHandler => Unit,
    isLoggable: Double => Boolean,
    log: (Double, String) => Unit,
    logp: (Double, String, String, String) => Unit,
    removeLogHandler: XLogHandler => Unit
  ): XLogger = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], addLogHandler = js.Any.fromFunction1(addLogHandler), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), logp = js.Any.fromFunction4(logp), removeLogHandler = js.Any.fromFunction1(removeLogHandler))
    __obj.asInstanceOf[XLogger]
  }
  
  @scala.inline
  implicit class XLoggerMutableBuilder[Self <: XLogger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLogHandler(value: XLogHandler => Unit): Self = StObject.set(x, "addLogHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLoggable(value: Double => Boolean): Self = StObject.set(x, "isLoggable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: (Double, String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLogp(value: (Double, String, String, String) => Unit): Self = StObject.set(x, "logp", js.Any.fromFunction4(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLogHandler(value: XLogHandler => Unit): Self = StObject.set(x, "removeLogHandler", js.Any.fromFunction1(value))
  }
}
