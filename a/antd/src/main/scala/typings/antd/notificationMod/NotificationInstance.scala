package typings.antd.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationInstance extends js.Object {
  def error(args: ArgsProps): Unit = js.native
  def info(args: ArgsProps): Unit = js.native
  def open(args: ArgsProps): Unit = js.native
  def success(args: ArgsProps): Unit = js.native
  def warning(args: ArgsProps): Unit = js.native
}

object NotificationInstance {
  @scala.inline
  def apply(
    error: ArgsProps => Unit,
    info: ArgsProps => Unit,
    open: ArgsProps => Unit,
    success: ArgsProps => Unit,
    warning: ArgsProps => Unit
  ): NotificationInstance = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[NotificationInstance]
  }
  @scala.inline
  implicit class NotificationInstanceOps[Self <: NotificationInstance] (val x: Self) extends AnyVal {
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
    def setError(value: ArgsProps => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: ArgsProps => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: ArgsProps => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: ArgsProps => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setWarning(value: ArgsProps => Unit): Self = this.set("warning", js.Any.fromFunction1(value))
  }
  
}

