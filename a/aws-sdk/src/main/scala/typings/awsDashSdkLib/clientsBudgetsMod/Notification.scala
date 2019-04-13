package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /**
    * The comparison that is used for this notification.
    */
  var ComparisonOperator: awsDashSdkLib.clientsBudgetsMod.ComparisonOperator
  /**
    * Whether this notification is in alarm. If a budget notification is in the ALARM state, you have passed the set threshold for the budget.
    */
  var NotificationState: js.UndefOr[NotificationState] = js.undefined
  /**
    * Whether the notification is for how much you have spent (ACTUAL) or for how much you're forecasted to spend (FORECASTED).
    */
  var NotificationType: awsDashSdkLib.clientsBudgetsMod.NotificationType
  /**
    * The threshold that is associated with a notification. Thresholds are always a percentage.
    */
  var Threshold: NotificationThreshold
  /**
    * The type of threshold for a notification. For ABSOLUTE_VALUE thresholds, AWS notifies you when you go over or are forecasted to go over your total cost threshold. For PERCENTAGE thresholds, AWS notifies you when you go over or are forecasted to go over a certain percentage of your forecasted spend. For example, if you have a budget for 200 dollars and you have a PERCENTAGE threshold of 80%, AWS notifies you when you go over 160 dollars.
    */
  var ThresholdType: js.UndefOr[ThresholdType] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    NotificationType: NotificationType,
    Threshold: NotificationThreshold,
    NotificationState: NotificationState = null,
    ThresholdType: ThresholdType = null
  ): Notification = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any], Threshold = Threshold)
    if (NotificationState != null) __obj.updateDynamic("NotificationState")(NotificationState.asInstanceOf[js.Any])
    if (ThresholdType != null) __obj.updateDynamic("ThresholdType")(ThresholdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

