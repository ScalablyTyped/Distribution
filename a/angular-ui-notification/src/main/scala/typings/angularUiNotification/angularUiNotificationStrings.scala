package typings.angularUiNotification

import typings.angularUiNotification.angularMod.uiNotification.MessageType
import typings.angularUiNotification.angularMod.uiNotification.XPosition
import typings.angularUiNotification.angularMod.uiNotification.YPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularUiNotificationStrings {
  
  @js.native
  sealed trait bottom
    extends StObject
       with YPosition
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center
    extends StObject
       with XPosition
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait error
    extends StObject
       with MessageType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with MessageType
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait left
    extends StObject
       with XPosition
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait primary
    extends StObject
       with MessageType
  inline def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait right
    extends StObject
       with XPosition
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait success
    extends StObject
       with MessageType
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait top
    extends StObject
       with YPosition
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait warning
    extends StObject
       with MessageType
  inline def warning: warning = "warning".asInstanceOf[warning]
}
