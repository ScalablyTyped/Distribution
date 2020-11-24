package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationWithSubscribers extends js.Object {
  
  /**
    * The notification that is associated with a budget.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification = js.native
  
  /**
    * A list of subscribers who are subscribed to this notification.
    */
  var Subscribers: typings.awsSdk.budgetsMod.Subscribers = js.native
}
object NotificationWithSubscribers {
  
  @scala.inline
  def apply(Notification: Notification, Subscribers: Subscribers): NotificationWithSubscribers = {
    val __obj = js.Dynamic.literal(Notification = Notification.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationWithSubscribers]
  }
  
  @scala.inline
  implicit class NotificationWithSubscribersOps[Self <: NotificationWithSubscribers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = this.set("Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
  }
}
