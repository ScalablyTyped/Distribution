package typings
package antdLib.libNotificationMod

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
    close: js.Function1[java.lang.String, scala.Unit],
    config: js.Function1[ConfigProps, scala.Unit],
    destroy: js.Function0[scala.Unit],
    error: js.Function1[ArgsProps, scala.Unit],
    info: js.Function1[ArgsProps, scala.Unit],
    open: js.Function1[ArgsProps, scala.Unit],
    success: js.Function1[ArgsProps, scala.Unit],
    warn: js.Function1[ArgsProps, scala.Unit],
    warning: js.Function1[ArgsProps, scala.Unit]
  ): NotificationApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("warn")(warn)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[NotificationApi]
  }
}

