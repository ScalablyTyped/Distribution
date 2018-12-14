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

