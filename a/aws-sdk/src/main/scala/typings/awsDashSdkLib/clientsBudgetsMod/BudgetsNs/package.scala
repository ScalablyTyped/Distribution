package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BudgetsNs {
  type AccountId = java.lang.String
  type BudgetName = java.lang.String
  type BudgetType = _BudgetType | java.lang.String
  type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]
  type Budgets = js.Array[Budget]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type DimensionValues = js.Array[GenericString]
  type GenericString = java.lang.String
  type GenericTimestamp = stdLib.Date
  type MaxResults = scala.Double
  type NotificationState = _NotificationState | java.lang.String
  type NotificationThreshold = scala.Double
  type NotificationType = _NotificationType | java.lang.String
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = scala.Boolean
  type NumericValue = java.lang.String
  type SubscriberAddress = java.lang.String
  type Subscribers = js.Array[Subscriber]
  type SubscriptionType = _SubscriptionType | java.lang.String
  type ThresholdType = _ThresholdType | java.lang.String
  type TimeUnit = _TimeUnit | java.lang.String
  type Types = js.Array[Budget]
  type UnitValue = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}
