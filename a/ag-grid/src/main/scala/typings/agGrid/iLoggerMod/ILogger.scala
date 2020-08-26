package typings.agGrid.iLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogger extends js.Object {
  def log(message: String): Unit = js.native
}

object ILogger {
  @scala.inline
  def apply(log: String => Unit): ILogger = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[ILogger]
  }
  @scala.inline
  implicit class ILoggerOps[Self <: ILogger] (val x: Self) extends AnyVal {
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
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
  }
  
}

