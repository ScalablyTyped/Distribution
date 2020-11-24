package typings.antd.messageMod

import typings.react.mod.Key
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageApi extends MessageInstance {
  
  def config(options: ConfigOptions): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(messageKey: Key): Unit = js.native
  
  def useMessage(): js.Tuple2[MessageInstance, ReactElement] = js.native
  
  def warn(content: JointContent): MessageType = js.native
  def warn(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
  def warn(content: JointContent, duration: ConfigDuration): MessageType = js.native
}
