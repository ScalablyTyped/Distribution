package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

