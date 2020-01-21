package typings.aureliaLogging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appender extends js.Object {
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
}

