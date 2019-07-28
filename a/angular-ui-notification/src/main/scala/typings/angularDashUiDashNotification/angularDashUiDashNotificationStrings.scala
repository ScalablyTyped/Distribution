package typings.angularDashUiDashNotification

import typings.angularDashUiDashNotification.angularMod.uiNotificationNs.MessageType
import typings.angularDashUiDashNotification.angularMod.uiNotificationNs.XPosition
import typings.angularDashUiDashNotification.angularMod.uiNotificationNs.YPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularDashUiDashNotificationStrings {
  @js.native
  sealed trait bottom extends YPosition
  
  @js.native
  sealed trait center extends XPosition
  
  @js.native
  sealed trait error extends MessageType
  
  @js.native
  sealed trait info extends MessageType
  
  @js.native
  sealed trait left extends XPosition
  
  @js.native
  sealed trait primary extends MessageType
  
  @js.native
  sealed trait right extends XPosition
  
  @js.native
  sealed trait success extends MessageType
  
  @js.native
  sealed trait top extends YPosition
  
  @js.native
  sealed trait warning extends MessageType
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

