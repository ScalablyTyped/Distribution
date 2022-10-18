package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmNotification extends StObject {
  
  /**
    * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on this alarm model.
    */
  var notificationActions: js.UndefOr[NotificationActions] = js.undefined
}
object AlarmNotification {
  
  inline def apply(): AlarmNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmNotification]
  }
  
  extension [Self <: AlarmNotification](x: Self) {
    
    inline def setNotificationActions(value: NotificationActions): Self = StObject.set(x, "notificationActions", value.asInstanceOf[js.Any])
    
    inline def setNotificationActionsUndefined: Self = StObject.set(x, "notificationActions", js.undefined)
    
    inline def setNotificationActionsVarargs(value: NotificationAction*): Self = StObject.set(x, "notificationActions", js.Array(value*))
  }
}
