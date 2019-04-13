package typings
package adalDashAngularLib.adalDashAngularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfig extends js.Object {
  var level: LoggingLevel
  var piiLoggingEnabled: scala.Boolean
  def log(message: java.lang.String): scala.Unit
}

object LoggingConfig {
  @scala.inline
  def apply(level: LoggingLevel, log: java.lang.String => scala.Unit, piiLoggingEnabled: scala.Boolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(level = level, log = js.Any.fromFunction1(log), piiLoggingEnabled = piiLoggingEnabled)
  
    __obj.asInstanceOf[LoggingConfig]
  }
}

