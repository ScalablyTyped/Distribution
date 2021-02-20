package typings.aureliaLogging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-logging", "Logger")
  @js.native
  class Logger protected () extends StObject {
    /**
      * You cannot instantiate the logger directly - you must use the getLogger method instead.
      */
    def this(id: String) = this()
    
    /**
      * Logs a debug message.
      *
      * @param message The message to log.
      * @param rest The data to log.
      */
    def debug(message: String, rest: js.Any*): Unit = js.native
    
    /**
      * Logs an error.
      *
      * @param message The message to log.
      * @param rest The data to log.
      */
    def error(message: String, rest: js.Any*): Unit = js.native
    
    /**
      * The id that the logger was created with.
      */
    var id: String = js.native
    
    /**
      * Logs info.
      *
      * @param message The message to log.
      * @param rest The data to log.
      */
    def info(message: String, rest: js.Any*): Unit = js.native
    
    /**
      * Returns if the logger is in debug mode or not.
      */
    def isDebugEnabled(): Boolean = js.native
    
    /**
      * The logging severity level for this logger
      */
    var level: Double = js.native
    
    /**
      * Sets the level of logging for this logger instance
      *
      * @param level Matches a value of logLevel specifying the level of logging.
      */
    def setLevel(level: Double): Unit = js.native
    
    /**
      * Logs a warning.
      *
      * @param message The message to log.
      * @param rest The data to log.
      */
    def warn(message: String, rest: js.Any*): Unit = js.native
  }
  
  @JSImport("aurelia-logging", "addAppender")
  @js.native
  def addAppender(appender: Appender): Unit = js.native
  
  @JSImport("aurelia-logging", "addCustomLevel")
  @js.native
  def addCustomLevel(name: String, value: Double): Unit = js.native
  
  @JSImport("aurelia-logging", "clearAppenders")
  @js.native
  def clearAppenders(): Unit = js.native
  
  @JSImport("aurelia-logging", "getAppenders")
  @js.native
  def getAppenders(): js.Any = js.native
  
  @JSImport("aurelia-logging", "getLevel")
  @js.native
  def getLevel(): Double = js.native
  
  @JSImport("aurelia-logging", "getLogger")
  @js.native
  def getLogger(id: String): Logger = js.native
  
  @JSImport("aurelia-logging", "logLevel")
  @js.native
  val logLevel: LogLevel_ = js.native
  
  @JSImport("aurelia-logging", "removeAppender")
  @js.native
  def removeAppender(appender: Appender): Unit = js.native
  
  @JSImport("aurelia-logging", "removeCustomLevel")
  @js.native
  def removeCustomLevel(name: String): Unit = js.native
  
  @JSImport("aurelia-logging", "setLevel")
  @js.native
  def setLevel(level: Double): Unit = js.native
  
  @js.native
  trait Appender extends StObject {
    
    /**
      * Appends a debug log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def debug(logger: Logger, rest: js.Any*): Unit = js.native
    
    /**
      * Appends an error log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def error(logger: Logger, rest: js.Any*): Unit = js.native
    
    /**
      * Appends an info log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def info(logger: Logger, rest: js.Any*): Unit = js.native
    
    /**
      * Appends a warning log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def warn(logger: Logger, rest: js.Any*): Unit = js.native
  }
  object Appender {
    
    @scala.inline
    def apply(
      debug: (Logger, /* repeated */ js.Any) => Unit,
      error: (Logger, /* repeated */ js.Any) => Unit,
      info: (Logger, /* repeated */ js.Any) => Unit,
      warn: (Logger, /* repeated */ js.Any) => Unit
    ): Appender = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Appender]
    }
    
    @scala.inline
    implicit class AppenderMutableBuilder[Self <: Appender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: (Logger, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(value: (Logger, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInfo(value: (Logger, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarn(value: (Logger, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LogLevel_
    extends /**
    * Additional log levels defined at runtime.
    */
  /* level */ StringDictionary[Double] {
    
    /**
      * Log all messages.
      */
    var debug: Double = js.native
    
    /**
      * Log only error messages.
      */
    var error: Double = js.native
    
    /**
      * Log informational messages or above.
      */
    var info: Double = js.native
    
    /**
      * No logging.
      */
    var none: Double = js.native
    
    /**
      * Log warnings messages or above.
      */
    var warn: Double = js.native
  }
  object LogLevel_ {
    
    @scala.inline
    def apply(debug: Double, error: Double, info: Double, none: Double, warn: Double): LogLevel_ = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogLevel_]
    }
    
    @scala.inline
    implicit class LogLevel_MutableBuilder[Self <: LogLevel_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
