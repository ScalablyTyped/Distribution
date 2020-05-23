package typings.aureliaLogging.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevel_
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

object LogLevel_ {
  @scala.inline
  def apply(
    debug: Double,
    error: Double,
    info: Double,
    none: Double,
    warn: Double,
    StringDictionary: /* index */ StringDictionary[Double] = null
  ): LogLevel_ = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevel_]
  }
}

