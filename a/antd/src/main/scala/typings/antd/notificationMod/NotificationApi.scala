package typings.antd.notificationMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationApi extends NotificationInstance {
  def close(key: String): Unit = js.native
  def config(options: ConfigProps): Unit = js.native
  def destroy(): Unit = js.native
  def useNotification(): js.Tuple2[NotificationInstance, ReactElement] = js.native
  def warn(args: ArgsProps): Unit = js.native
}

object NotificationApi {
  @scala.inline
  def apply(
    close: String => Unit,
    config: ConfigProps => Unit,
    destroy: () => Unit,
    error: ArgsProps => Unit,
    info: ArgsProps => Unit,
    open: ArgsProps => Unit,
    success: ArgsProps => Unit,
    useNotification: () => js.Tuple2[NotificationInstance, ReactElement],
    warn: ArgsProps => Unit,
    warning: ArgsProps => Unit
  ): NotificationApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), config = js.Any.fromFunction1(config), destroy = js.Any.fromFunction0(destroy), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), useNotification = js.Any.fromFunction0(useNotification), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[NotificationApi]
  }
  @scala.inline
  implicit class NotificationApiOps[Self <: NotificationApi] (val x: Self) extends AnyVal {
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
    def setClose(value: String => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: ConfigProps => Unit): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setUseNotification(value: () => js.Tuple2[NotificationInstance, ReactElement]): Self = this.set("useNotification", js.Any.fromFunction0(value))
    @scala.inline
    def setWarn(value: ArgsProps => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

