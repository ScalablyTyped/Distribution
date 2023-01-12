package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationWithSubscribers extends StObject {
  
  /**
    * The notification that's associated with a budget.
    */
  var Notification: typings.awsSdk.clientsBudgetsMod.Notification
  
  /**
    * A list of subscribers who are subscribed to this notification.
    */
  var Subscribers: typings.awsSdk.clientsBudgetsMod.Subscribers
}
object NotificationWithSubscribers {
  
  inline def apply(Notification: Notification, Subscribers: Subscribers): NotificationWithSubscribers = {
    val __obj = js.Dynamic.literal(Notification = Notification.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationWithSubscribers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationWithSubscribers] (val x: Self) extends AnyVal {
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
