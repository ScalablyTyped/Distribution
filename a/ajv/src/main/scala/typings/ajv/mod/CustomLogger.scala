package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLogger extends js.Object {
  def error(args: js.Any*): js.Any = js.native
  def log(args: js.Any*): js.Any = js.native
  def warn(args: js.Any*): js.Any = js.native
}

object CustomLogger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => js.Any,
    log: /* repeated */ js.Any => js.Any,
    warn: /* repeated */ js.Any => js.Any
  ): CustomLogger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[CustomLogger]
  }
  @scala.inline
  implicit class CustomLoggerOps[Self <: CustomLogger] (val x: Self) extends AnyVal {
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
    def setError(value: /* repeated */ js.Any => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => js.Any): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => js.Any): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

