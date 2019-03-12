package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationWithSubscribers extends js.Object {
  /**
    * The notification that is associated with a budget.
    */
  var Notification: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.Notification
  /**
    * A list of subscribers who are subscribed to this notification.
    */
  var Subscribers: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.Subscribers
}

object NotificationWithSubscribers {
  @scala.inline
  def apply(Notification: Notification, Subscribers: Subscribers): NotificationWithSubscribers = {
    val __obj = js.Dynamic.literal(Notification = Notification, Subscribers = Subscribers)
  
    __obj.asInstanceOf[NotificationWithSubscribers]
  }
}

