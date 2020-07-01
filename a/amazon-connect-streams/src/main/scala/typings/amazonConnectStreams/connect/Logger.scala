package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Streams library comes with a logging utility that can be used to easily gather logs and provide them for diagnostic purposes.
  * You can even add your own logs to this logger if you prefer.
  * Logs are written to the console log per normal and also kept in memory.
  */
trait Logger extends js.Object {
  /**
    * Adds a log entry with debug level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def debug(template: String, args: js.Any*): LogEntry
  /** Downloads the logs on the agent's machine in JSON form. */
  def download(): Unit
  /**
    * Adds a log entry with error level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def error(template: String, args: js.Any*): LogEntry
  /**
    * Adds a log entry with info level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def info(template: String, args: js.Any*): LogEntry
  /**
    * Adds a log entry with warn level.
    * @param template The `printf`-style template.
    * @param args The arguments to the template.
    */
  def warn(template: String, args: js.Any*): LogEntry
}

object Logger {
  @scala.inline
  def apply(
    debug: (String, /* repeated */ js.Any) => LogEntry,
    download: () => Unit,
    error: (String, /* repeated */ js.Any) => LogEntry,
    info: (String, /* repeated */ js.Any) => LogEntry,
    warn: (String, /* repeated */ js.Any) => LogEntry
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), download = js.Any.fromFunction0(download), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), warn = js.Any.fromFunction2(warn))
    __obj.asInstanceOf[Logger]
  }
}

