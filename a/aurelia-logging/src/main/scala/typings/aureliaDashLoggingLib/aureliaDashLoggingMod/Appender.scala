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

