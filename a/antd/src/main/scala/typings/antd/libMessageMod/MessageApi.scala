package typings.antd.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageApi extends js.Object {
  def config(options: ConfigOptions): Unit = js.native
  def destroy(): Unit = js.native
  def error(content: ConfigContent): MessageType = js.native
  def error(content: ConfigContent, duration: ConfigDuration): MessageType = js.native
  def error(content: ConfigContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def info(content: ConfigContent): MessageType = js.native
  def info(content: ConfigContent, duration: ConfigDuration): MessageType = js.native
  def info(content: ConfigContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def loading(content: ConfigContent): MessageType = js.native
  def loading(content: ConfigContent, duration: ConfigDuration): MessageType = js.native
  def loading(content: ConfigContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def open(args: ArgsProps): MessageType = js.native
  def success(content: ConfigContent): MessageType = js.native
  def success(content: ConfigContent, duration: ConfigDuration): MessageType = js.native
  def success(content: ConfigContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def warn(content: ConfigContent): MessageType = js.native
  def warn(content: ConfigContent, duration: ConfigDuration): MessageType = js.native
  def warn(content: ConfigContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def warning(content: ConfigContent): MessageType = js.native
  def warning(content: ConfigContent, duration: ConfigDuration): MessageType = js.native
  def warning(content: ConfigContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
}

