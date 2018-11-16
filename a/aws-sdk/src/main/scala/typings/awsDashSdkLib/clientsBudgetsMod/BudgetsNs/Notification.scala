package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Notification extends js.Object {
  /**
       * The comparison used for this notification.
       */
  var ComparisonOperator: ComparisonOperator
  /**
       * Whether the notification is for how much you have spent (ACTUAL) or for how much you are forecasted to spend (FORECASTED).
       */
  var NotificationType: NotificationType
  /**
       * The threshold associated with a notification. Thresholds are always a percentage.
       */
  var Threshold: NotificationThreshold
  /**
       * The type of threshold for a notification. For ACTUAL thresholds, AWS notifies you when you go over the threshold, and for FORECASTED thresholds AWS notifies you when you are forecasted to go over the threshold.
       */
  var ThresholdType: js.UndefOr[ThresholdType] = js.undefined
}

