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

