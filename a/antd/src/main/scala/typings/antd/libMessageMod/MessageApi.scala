package typings.antd.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageApi extends js.Object {
  def config(options: ConfigOptions): Unit = js.native
  def destroy(): Unit = js.native
  def error(content: JointContent): MessageType = js.native
  def error(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def error(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def info(content: JointContent): MessageType = js.native
  def info(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def info(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def loading(content: JointContent): MessageType = js.native
  def loading(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def loading(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def open(args: ArgsProps): MessageType = js.native
  def success(content: JointContent): MessageType = js.native
  def success(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def success(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def warn(content: JointContent): MessageType = js.native
  def warn(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def warn(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  def warning(content: JointContent): MessageType = js.native
  def warning(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def warning(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
}

