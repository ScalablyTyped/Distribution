package typings.aureliaLogging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-logging", "Logger")
@js.native
class Logger protected () extends js.Object {
  /**
    * You cannot instantiate the logger directly - you must use the getLogger method instead.
    */
  def this(id: String) = this()
  /**
    * The id that the logger was created with.
    */
  var id: String = js.native
  /**
    * The logging severity level for this logger
    */
  var level: Double = js.native
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

