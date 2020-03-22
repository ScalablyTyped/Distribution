package typings.antd.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationInstance extends js.Object {
  def error(args: ArgsProps): Unit
  def info(args: ArgsProps): Unit
  def open(args: ArgsProps): Unit
  def success(args: ArgsProps): Unit
  def warning(args: ArgsProps): Unit
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
}

