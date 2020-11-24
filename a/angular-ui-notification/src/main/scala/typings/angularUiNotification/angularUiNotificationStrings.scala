package typings.angularUiNotification

import typings.angularUiNotification.mod.uiNotification.MessageType
import typings.angularUiNotification.mod.uiNotification.XPosition
import typings.angularUiNotification.mod.uiNotification.YPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularUiNotificationStrings {
  
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
}
