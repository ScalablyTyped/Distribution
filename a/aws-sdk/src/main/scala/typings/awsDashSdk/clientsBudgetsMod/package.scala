package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsBudgetsMod {
  type AccountId = String
  type BudgetName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USAGE
    - typings.awsDashSdk.awsDashSdkStrings.COST
    - typings.awsDashSdk.awsDashSdkStrings.RI_UTILIZATION
    - typings.awsDashSdk.awsDashSdkStrings.RI_COVERAGE
    - java.lang.String
  */
  type BudgetType = _BudgetType | String
  type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]
  type Budgets = js.Array[Budget]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN
    - typings.awsDashSdk.awsDashSdkStrings.EQUAL_TO
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | String
  type CostFilters = StringDictionary[DimensionValues]
  type DimensionValues = js.Array[GenericString]
  type GenericString = String
  type GenericTimestamp = Date
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OK
    - typings.awsDashSdk.awsDashSdkStrings.ALARM
    - java.lang.String
  */
  type NotificationState = _NotificationState | String
  type NotificationThreshold = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTUAL
    - typings.awsDashSdk.awsDashSdkStrings.FORECASTED
    - java.lang.String
  */
  type NotificationType = _NotificationType | String
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = Boolean
  type NumericValue = String
  type PlannedBudgetLimits = StringDictionary[Spend]
  type SubscriberAddress = String
  type Subscribers = js.Array[Subscriber]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SNS
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = _SubscriptionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PERCENTAGE
    - typings.awsDashSdk.awsDashSdkStrings.ABSOLUTE_VALUE
    - java.lang.String
  */
  type ThresholdType = _ThresholdType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DAILY
    - typings.awsDashSdk.awsDashSdkStrings.MONTHLY
    - typings.awsDashSdk.awsDashSdkStrings.QUARTERLY
    - typings.awsDashSdk.awsDashSdkStrings.ANNUALLY
    - java.lang.String
  */
  type TimeUnit = _TimeUnit | String
  type UnitValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-10-20`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
