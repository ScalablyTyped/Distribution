package typings.aureliaLogging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def addAppender(appender: Appender): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAppender")(appender.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addCustomLevel(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomLevel")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clearAppenders(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAppenders")().asInstanceOf[Unit]
  
  @scala.inline
  def getAppenders(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppenders")().asInstanceOf[js.Any]
  
  @scala.inline
  def getLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")().asInstanceOf[Double]
  
  @scala.inline
  def getLogger(id: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(id.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  @JSImport("aurelia-logging", "logLevel")
  @js.native
  val logLevel: LogLevel_ = js.native
  
  @scala.inline
  def removeAppender(appender: Appender): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAppender")(appender.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeCustomLevel(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomLevel")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setLevel(level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Appender extends StObject {
    
    /**
      * Appends a debug log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def debug(logger: Logger, rest: js.Any*): Unit
    
    /**
      * Appends an error log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def error(logger: Logger, rest: js.Any*): Unit
    
    /**
      * Appends an info log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def info(logger: Logger, rest: js.Any*): Unit
    
    /**
      * Appends a warning log.
      *
      * @param logger The source logger.
      * @param rest The data to log.
      */
    def warn(logger: Logger, rest: js.Any*): Unit
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
  
  trait LogLevel_
    extends StObject
       with /**
    * Additional log levels defined at runtime.
    */
  /* level */ StringDictionary[Double] {
    
    /**
      * Log all messages.
      */
    var debug: Double
    
    /**
      * Log only error messages.
      */
    var error: Double
    
    /**
      * Log informational messages or above.
      */
    var info: Double
    
    /**
      * No logging.
      */
    var none: Double
    
    /**
      * Log warnings messages or above.
      */
    var warn: Double
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
