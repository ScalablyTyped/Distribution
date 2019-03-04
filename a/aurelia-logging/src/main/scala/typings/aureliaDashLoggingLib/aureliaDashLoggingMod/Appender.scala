package typings
package aureliaDashLoggingLib.aureliaDashLoggingMod

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
  def debug(logger: Logger, rest: js.Any*): scala.Unit
  /**
    * Appends an error log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def error(logger: Logger, rest: js.Any*): scala.Unit
  /**
    * Appends an info log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def info(logger: Logger, rest: js.Any*): scala.Unit
  /**
    * Appends a warning log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def warn(logger: Logger, rest: js.Any*): scala.Unit
}

object Appender {
  @scala.inline
  def apply(
    debug: js.Function2[Logger, /* repeated */ js.Any, scala.Unit],
    error: js.Function2[Logger, /* repeated */ js.Any, scala.Unit],
    info: js.Function2[Logger, /* repeated */ js.Any, scala.Unit],
    warn: js.Function2[Logger, /* repeated */ js.Any, scala.Unit]
  ): Appender = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, info = info, warn = warn)
  
    __obj.asInstanceOf[Appender]
  }
}

