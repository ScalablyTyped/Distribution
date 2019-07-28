package typings.aureliaDashLogging.aureliaDashLoggingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevel
  extends /**
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

object LogLevel {
  @scala.inline
  def apply(
    debug: Double,
    error: Double,
    info: Double,
    none: Double,
    warn: Double,
    StringDictionary: /**
    * Additional log levels defined at runtime.
    */
  /* level */ StringDictionary[Double] = null
  ): LogLevel = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, info = info, none = none, warn = warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevel]
  }
}

