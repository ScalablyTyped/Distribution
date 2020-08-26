package typings.adalAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfig extends js.Object {
  var level: LoggingLevel = js.native
  var piiLoggingEnabled: Boolean = js.native
  def log(message: String): Unit = js.native
}

object LoggingConfig {
  @scala.inline
  def apply(level: LoggingLevel, log: String => Unit, piiLoggingEnabled: Boolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), piiLoggingEnabled = piiLoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  @scala.inline
  implicit class LoggingConfigOps[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLevel(value: LoggingLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setPiiLoggingEnabled(value: Boolean): Self = this.set("piiLoggingEnabled", value.asInstanceOf[js.Any])
  }
  
}

