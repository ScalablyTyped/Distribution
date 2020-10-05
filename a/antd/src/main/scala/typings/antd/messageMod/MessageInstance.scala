package typings.antd.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageInstance extends js.Object {
  def error(content: JointContent): MessageType = js.native
  def error(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
  def error(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def info(content: JointContent): MessageType = js.native
  def info(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
  def info(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def loading(content: JointContent): MessageType = js.native
  def loading(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
  def loading(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def open(args: ArgsProps): MessageType = js.native
  def success(content: JointContent): MessageType = js.native
  def success(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
  def success(content: JointContent, duration: ConfigDuration): MessageType = js.native
  def warning(content: JointContent): MessageType = js.native
  def warning(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
  def warning(content: JointContent, duration: ConfigDuration): MessageType = js.native
}

