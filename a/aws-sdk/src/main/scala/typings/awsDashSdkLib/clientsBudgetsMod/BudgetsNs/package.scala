package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BudgetsNs {
  type AccountId = java.lang.String
  type BudgetName = java.lang.String
  type BudgetType = awsDashSdkLib.awsDashSdkLibStrings.USAGE | awsDashSdkLib.awsDashSdkLibStrings.COST | awsDashSdkLib.awsDashSdkLibStrings.RI_UTILIZATION | awsDashSdkLib.awsDashSdkLibStrings.RI_COVERAGE | java.lang.String
  type Budgets = js.Array[Budget]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN | awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN | awsDashSdkLib.awsDashSdkLibStrings.EQUAL_TO | java.lang.String
  type DimensionValues = js.Array[GenericString]
  type GenericString = java.lang.String
  type GenericTimestamp = stdLib.Date
  type MaxResults = scala.Double
  type NotificationThreshold = scala.Double
  type NotificationType = awsDashSdkLib.awsDashSdkLibStrings.ACTUAL | awsDashSdkLib.awsDashSdkLibStrings.FORECASTED | java.lang.String
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = scala.Boolean
  type NumericValue = java.lang.String
  type SubscriberAddress = java.lang.String
  type Subscribers = js.Array[Subscriber]
  type SubscriptionType = awsDashSdkLib.awsDashSdkLibStrings.SNS | awsDashSdkLib.awsDashSdkLibStrings.EMAIL | java.lang.String
  type ThresholdType = awsDashSdkLib.awsDashSdkLibStrings.PERCENTAGE | awsDashSdkLib.awsDashSdkLibStrings.ABSOLUTE_VALUE | java.lang.String
  type TimeUnit = awsDashSdkLib.awsDashSdkLibStrings.DAILY | awsDashSdkLib.awsDashSdkLibStrings.MONTHLY | awsDashSdkLib.awsDashSdkLibStrings.QUARTERLY | awsDashSdkLib.awsDashSdkLibStrings.ANNUALLY | java.lang.String
  type Types = js.Array[Budget]
  type UnitValue = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-10-20` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}
