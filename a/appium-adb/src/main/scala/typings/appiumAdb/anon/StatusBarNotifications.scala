package typings.appiumAdb.anon

import typings.appiumAdb.libToolsSettingsClientCommandsMod.StatusBarNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarNotifications extends StObject {
  
  var statusBarNotifications: js.Array[StatusBarNotification]
}
object StatusBarNotifications {
  
  inline def apply(statusBarNotifications: js.Array[StatusBarNotification]): StatusBarNotifications = {
    val __obj = js.Dynamic.literal(statusBarNotifications = statusBarNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarNotifications]
  }
  
  extension [Self <: StatusBarNotifications](x: Self) {
    
    inline def setStatusBarNotifications(value: js.Array[StatusBarNotification]): Self = StObject.set(x, "statusBarNotifications", value.asInstanceOf[js.Any])
    
    inline def setStatusBarNotificationsVarargs(value: StatusBarNotification*): Self = StObject.set(x, "statusBarNotifications", js.Array(value*))
  }
}
