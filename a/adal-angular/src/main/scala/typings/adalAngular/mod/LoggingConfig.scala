package typings.adalAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfig extends js.Object {
  var level: LoggingLevel
  var piiLoggingEnabled: Boolean
  def log(message: String): Unit
}

object LoggingConfig {
  @scala.inline
  def apply(level: LoggingLevel, log: String => Unit, piiLoggingEnabled: Boolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), piiLoggingEnabled = piiLoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
}

