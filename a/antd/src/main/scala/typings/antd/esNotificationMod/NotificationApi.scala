package typings.antd.esNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationApi extends js.Object {
  def close(key: String): Unit
  def config(options: ConfigProps): Unit
  def destroy(): Unit
  def error(args: ArgsProps): Unit
  def info(args: ArgsProps): Unit
  def open(args: ArgsProps): Unit
  def success(args: ArgsProps): Unit
  def warn(args: ArgsProps): Unit
  def warning(args: ArgsProps): Unit
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
    warn: ArgsProps => Unit,
    warning: ArgsProps => Unit
  ): NotificationApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), config = js.Any.fromFunction1(config), destroy = js.Any.fromFunction0(destroy), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
  
    __obj.asInstanceOf[NotificationApi]
  }
}

