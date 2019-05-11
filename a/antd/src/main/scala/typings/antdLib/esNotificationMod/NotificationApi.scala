package typings
package antdLib.esNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationApi extends js.Object {
  def close(key: java.lang.String): scala.Unit
  def config(options: ConfigProps): scala.Unit
  def destroy(): scala.Unit
  def error(args: ArgsProps): scala.Unit
  def info(args: ArgsProps): scala.Unit
  def open(args: ArgsProps): scala.Unit
  def success(args: ArgsProps): scala.Unit
  def warn(args: ArgsProps): scala.Unit
  def warning(args: ArgsProps): scala.Unit
}

object NotificationApi {
  @scala.inline
  def apply(
    close: java.lang.String => scala.Unit,
    config: ConfigProps => scala.Unit,
    destroy: () => scala.Unit,
    error: ArgsProps => scala.Unit,
    info: ArgsProps => scala.Unit,
    open: ArgsProps => scala.Unit,
    success: ArgsProps => scala.Unit,
    warn: ArgsProps => scala.Unit,
    warning: ArgsProps => scala.Unit
  ): NotificationApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), config = js.Any.fromFunction1(config), destroy = js.Any.fromFunction0(destroy), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
  
    __obj.asInstanceOf[NotificationApi]
  }
}

