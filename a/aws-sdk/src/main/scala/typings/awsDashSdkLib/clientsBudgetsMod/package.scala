package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsBudgetsMod {
  type AccountId = java.lang.String
  type BudgetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USAGE
    - awsDashSdkLib.awsDashSdkLibStrings.COST
    - awsDashSdkLib.awsDashSdkLibStrings.RI_UTILIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.RI_COVERAGE
    - java.lang.String
  */
  type BudgetType = _BudgetType | java.lang.String
  type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]
  type Budgets = js.Array[Budget]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.EQUAL_TO
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type CostFilters = org.scalablytyped.runtime.StringDictionary[DimensionValues]
  type DimensionValues = js.Array[GenericString]
  type GenericString = java.lang.String
  type GenericTimestamp = stdLib.Date
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OK
    - awsDashSdkLib.awsDashSdkLibStrings.ALARM
    - java.lang.String
  */
  type NotificationState = _NotificationState | java.lang.String
  type NotificationThreshold = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTUAL
    - awsDashSdkLib.awsDashSdkLibStrings.FORECASTED
    - java.lang.String
  */
  type NotificationType = _NotificationType | java.lang.String
  type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]
  type Notifications = js.Array[Notification]
  type NullableBoolean = scala.Boolean
  type NumericValue = java.lang.String
  type SubscriberAddress = java.lang.String
  type Subscribers = js.Array[Subscriber]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SNS
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = _SubscriptionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PERCENTAGE
    - awsDashSdkLib.awsDashSdkLibStrings.ABSOLUTE_VALUE
    - java.lang.String
  */
  type ThresholdType = _ThresholdType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DAILY
    - awsDashSdkLib.awsDashSdkLibStrings.MONTHLY
    - awsDashSdkLib.awsDashSdkLibStrings.QUARTERLY
    - awsDashSdkLib.awsDashSdkLibStrings.ANNUALLY
    - java.lang.String
  */
  type TimeUnit = _TimeUnit | java.lang.String
  type UnitValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-10-20`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
