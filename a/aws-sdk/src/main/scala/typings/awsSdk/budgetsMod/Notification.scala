package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /**
    * The comparison that is used for this notification.
    */
  var ComparisonOperator: typings.awsSdk.budgetsMod.ComparisonOperator = js.native
  /**
    * Whether this notification is in alarm. If a budget notification is in the ALARM state, you have passed the set threshold for the budget.
    */
  var NotificationState: js.UndefOr[typings.awsSdk.budgetsMod.NotificationState] = js.native
  /**
    * Whether the notification is for how much you have spent (ACTUAL) or for how much you're forecasted to spend (FORECASTED).
    */
  var NotificationType: typings.awsSdk.budgetsMod.NotificationType = js.native
  /**
    * The threshold that is associated with a notification. Thresholds are always a percentage.
    */
  var Threshold: NotificationThreshold = js.native
  /**
    * The type of threshold for a notification. For ABSOLUTE_VALUE thresholds, AWS notifies you when you go over or are forecasted to go over your total cost threshold. For PERCENTAGE thresholds, AWS notifies you when you go over or are forecasted to go over a certain percentage of your forecasted spend. For example, if you have a budget for 200 dollars and you have a PERCENTAGE threshold of 80%, AWS notifies you when you go over 160 dollars.
    */
  var ThresholdType: js.UndefOr[typings.awsSdk.budgetsMod.ThresholdType] = js.native
}

object Notification {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    NotificationType: NotificationType,
    Threshold: NotificationThreshold
  ): Notification = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationType(value: NotificationType): Self = this.set("NotificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreshold(value: NotificationThreshold): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationState(value: NotificationState): Self = this.set("NotificationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationState: Self = this.set("NotificationState", js.undefined)
    @scala.inline
    def setThresholdType(value: ThresholdType): Self = this.set("ThresholdType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdType: Self = this.set("ThresholdType", js.undefined)
  }
  
}

