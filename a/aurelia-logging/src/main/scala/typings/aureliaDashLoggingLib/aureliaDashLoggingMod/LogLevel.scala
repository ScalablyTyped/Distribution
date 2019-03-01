package typings
package aureliaDashLoggingLib.aureliaDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevel
  extends /**
  * Additional log levels defined at runtime.
  */
/* level */ org.scalablytyped.runtime.StringDictionary[scala.Double] {
  /**
    * Log all messages.
    */
  var debug: scala.Double
  /**
    * Log only error messages.
    */
  var error: scala.Double
  /**
    * Log informational messages or above.
    */
  var info: scala.Double
  /**
    * No logging.
    */
  var none: scala.Double
  /**
    * Log warnings messages or above.
    */
  var warn: scala.Double
}

object LogLevel {
  @scala.inline
  def apply(
    debug: scala.Double,
    error: scala.Double,
    info: scala.Double,
    none: scala.Double,
    warn: scala.Double,
    StringDictionary: /**
    * Additional log levels defined at runtime.
    */
  /* level */ org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): LogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("warn")(warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevel]
  }
}

