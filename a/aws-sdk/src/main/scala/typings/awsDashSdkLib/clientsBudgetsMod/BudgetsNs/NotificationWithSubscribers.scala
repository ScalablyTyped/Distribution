package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationWithSubscribers extends js.Object {
  /**
    * The notification that is associated with a budget.
    */
  var Notification: Notification
  /**
    * A list of subscribers who are subscribed to this notification.
    */
  var Subscribers: Subscribers
}

object NotificationWithSubscribers {
  @scala.inline
  def apply(Notification: Notification, Subscribers: Subscribers): NotificationWithSubscribers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Notification")(Notification)
    __obj.updateDynamic("Subscribers")(Subscribers)
    __obj.asInstanceOf[NotificationWithSubscribers]
  }
}

